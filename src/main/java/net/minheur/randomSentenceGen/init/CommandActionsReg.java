package net.minheur.randomSentenceGen.init;

import net.minheur.potoflux.terminal.CommandProcessor;
import net.minheur.potoflux.translations.Translations;
import net.minheur.randomSentenceGen.gen.GeneratingSentenceHandler;

import java.util.List;

public class CommandActionsReg {
    static void generate(List<String> args) {
        if (argAmountCheck(0, 1, args)) {
            CommandProcessor.appendOutput(generateHelp());
            return;
        }

        String sentenceName = args.get(0);
        if (sentenceName == null)
            sentenceName = "default";

        GeneratingSentenceHandler.generateSentence(sentenceName);

    }

    private static String generateHelp() {
        return Translations.get("rsg:command.generate") + tabLine +
                Translations.get("rsg:command.generate.use") + tabLine +
                Translations.get("rsg.command.generate.use.speList");
    }


    @Deprecated
    public static final String tab = "    ";
    @Deprecated
    public static final String tabLine = "\n" + tab;
    @Deprecated
    public static boolean argAmountCheck(int min, int max, List<String> args) {
        int actual = args.size();
        return actual < min || actual > max;
    }
}
