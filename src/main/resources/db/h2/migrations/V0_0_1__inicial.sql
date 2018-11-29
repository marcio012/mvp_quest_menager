-- H2 -> versao 0.0.1 -> teste de crud com rest

CREATE TABLE topic (
  topic_no INT PRIMARY KEY AUTO_INCREMENT,
  topic_title VARCHAR(100),
  topic_content VARCHAR(2000)
);

-- data

INSERT
INTO topic
(
  topic_title,
  topic_content,
)
VALUES
  ('topic_title 1', 'topic_content 1'),
  ('topic_title 2', 'topic_content 2'),
  ('topic_title 3', 'topic_content 3'),
  ('topic_title 4', 'topic_content 4'),
  ('topic_title 5', 'topic_content 5');