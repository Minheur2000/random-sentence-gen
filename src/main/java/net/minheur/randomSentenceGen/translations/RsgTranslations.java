package net.minheur.randomSentenceGen.translations;

import net.minheur.potoflux.translations.AbstractTranslationsRegistry;
import net.minheur.randomSentenceGen.RandomSentenceGenerator;

public class RsgTranslations extends AbstractTranslationsRegistry {
    public RsgTranslations() {
        super(RandomSentenceGenerator.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addCommand("generate")
                .en("Generate a random sentence with the list you gave")
                .fr("Génère une phrase aléatoire depuis une liste");
        addCommandUse("generate")
                .en("Usage: generate")
                .fr("Utilisation : generate");
        addCommandUse("generate", "speList")
                .en("Usage: generate <from list...>")
                .fr("Utilisation : generate <depuis la list...>");
    }
}
