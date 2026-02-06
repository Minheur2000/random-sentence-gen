package net.minheur.randomSentenceGen.init;

import net.minheur.potoflux.loader.mod.events.RegisterCommandsEvent;
import net.minheur.potoflux.registry.RegistryList;
import net.minheur.potoflux.terminal.Command;
import net.minheur.potoflux.utils.ressourcelocation.ResourceLocation;
import net.minheur.randomSentenceGen.RandomSentenceGenerator;

public class RsgCommands {
    private final RegistryList<Command> LIST = new RegistryList<>();
    private static boolean hasGenerated = false;

    public static RsgCommands INSTANCE;

    public RsgCommands() {
        if (hasGenerated) throw new IllegalStateException("Can't create the registry 2 times !");
        hasGenerated = true;
    }

    public final Command GENERATE = LIST.add(new Command(new ResourceLocation(RandomSentenceGenerator.MOD_ID, "generate"), "mkSentence", CommandActionsReg::generate));

    public static void register(RegisterCommandsEvent event) {
        INSTANCE = new RsgCommands();
        INSTANCE.LIST.register(event.reg);
    }

}
