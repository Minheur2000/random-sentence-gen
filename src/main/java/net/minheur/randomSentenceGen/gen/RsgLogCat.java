package net.minheur.randomSentenceGen.gen;

import net.minheur.potoflux.logger.ILogCategory;

public enum RsgLogCat implements ILogCategory {
    FILE_LIST("list filling");

    private final String code;

    RsgLogCat(String code) {
        this.code = code;
    }

    @Override
    public String code() {
        return code;
    }
}
