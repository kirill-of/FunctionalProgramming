package pro.ofitserov.stepik.functionalprogramming.practicallessons.t18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Step {
    /**
     * Create a stream that will detect bad words in a text according to a bad words list. All words in the text are divided by whitespaces (always only one whitespace between two words).
     * <p>
     * After calling collect(Collectors.toList()) the stream must return the list of bad words which were found in the text. The result should be dictionary ordered (in lexicographical order, i.e. sorted) and bad words shouldn't repeat.
     * <p>
     * Important. You need return a prepared stream from the template method, not a list of bad words. Pay attention to the method template. Do not change it!
     */

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        // write your stream here
        return Arrays.stream(text.split(" "))
                .filter(badWords::contains)
                .distinct()
                .sorted();
    }


    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,";
        List<String> badWords = Arrays.asList("amet", "commodo");

        createBadWordsDetectingStream(text, badWords).forEach(System.out::println);
    }
}
