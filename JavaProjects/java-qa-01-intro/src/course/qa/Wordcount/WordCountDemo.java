package course.qa.Wordcount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountDemo {
    public static final String WIKI_TEXT = """
            Java is a high-level, class-based, object-oriented programming language that is designed to have as few
             implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[19][20] particularly for client–server web applications, with a reported 9 million developers.[21]
                        
            Java was originally developed by James Gosling at Sun Microsystems and released in May 1995 as a core
             component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux distributions.
                        
            As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support
             (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.
                        
            Oracle (and others) highly recommend uninstalling outdated and unsupported versions of Java, due to 
            unresolved security issues in older versions.[22] Oracle advises its users to immediately transition to a 
            supported version, such as one of the LTS versions
            """;
    public static void main (String[] arg) {
        String[] lines = WIKI_TEXT.split("\n");
        System.out.printf("Lines count: %d%n", lines.length);

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String line : lines) {
            line = line.trim();
            if  (line.length() == 0) {
                continue;
            }

            var words = line.split("\\W+");
            System.out.println(Arrays.toString(words));
            for(String word: words) {
                if (word.length() < 3) {
                    continue;
                }
            }
        }
    }
}
