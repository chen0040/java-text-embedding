# java-word-embedding

Word embedding in Java

The current project provides GloVe word embedding that developer can directly use within their project.

# Usage

The [sample codes](src/main/java/com/github/chen0040/embeddings/GloVeModelDemo.java) below shows how to use
[GloVeModel](src/main/java/com/github/chen0040/embeddings/GloVeModel.java) to create GloVe word embedding of different
dimensions (e.g., 50, 100, 200, 300) 

```java

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.chen0040.embeddings.GloVeModel;

public class GloVeModelDemo {

    private static final Logger logger = LoggerFactory.getLogger(GloVeModelDemo.class);

    public static void main(String[] args) {
        GloVeModel model = new GloVeModel();
        model.load100();

        logger.info("word2em size: {}", model.size());
        logger.info("word2em dimension for individual word: {}", model.getWordVecDimension());

        logger.info("father: {}", model.encodeWord("father"));
        logger.info("mother: {}", model.encodeWord("mother"));
        logger.info("man: {}", model.encodeWord("man"));
        logger.info("woman: {}", model.encodeWord("woman"));
        logger.info("boy: {}", model.encodeWord("boy"));
        logger.info("girl: {}", model.encodeWord("girl"));
        
        logger.info("distance between boy and girl: {}", model.distance("boy", "girl"));


        String doc = "The Zen of Python. Beautiful is better than ugly. Explicit is better than implicit. Simple is better than complex. Complex is better than complicated. Flat is better than nested. Sparse is better than dense. Readability counts. Special cases aren't special enough to break the rules.";

        logger.info("doc: {}", model.encodeDocument(doc));


    }
}
```