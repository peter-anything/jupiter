package com.galaxy.jupiter.api.performance.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<String> getAllLinesFromResourceFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);
            BufferedReader  reader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lines;
    }
}
