package net.minheur.randomSentenceGen.gen;

import net.minheur.potoflux.logger.PtfLogger;
import net.minheur.potoflux.utils.Json;
import net.minheur.randomSentenceGen.RandomSentenceGenerator;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class GeneratingSentenceHandler {
    private static Map<String, SentenceList> allSentenceList = new HashMap<>();

    public static void generateSentence(String sentenceCatalog) {

    }

    public static void fillList() {
        allSentenceList.clear();
        fillListDefault();

        Path target = RandomSentenceGenerator.getModDir().resolve("");
    }

    private static void fillListDefault() {
        String content;

        try (InputStream is = GeneratingSentenceHandler.class.getResourceAsStream("/default.json")) {
            if (is == null)
                throw new RuntimeException("Resource not found: 'default.json'");

            content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            PtfLogger.error("Could not get default list file !", RsgLogCat.FILE_LIST);
            return;
        }

        SentenceList defaultList = Json.GSON.fromJson(content, SentenceList.class);

        allSentenceList.put("default", defaultList);
    }

}
