DROP TABLE IF EXISTS cafes;

CREATE TABLE cafes (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  place VARCHAR(100) NOT NULL,
  detail VARCHAR(200) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO cafes (name, place, detail) VALUES ("FabCafeTokyo", "渋谷", "渋谷道玄坂にある3Dプリンタやレーザーが使えるデジタルものづくりカフェ。");
INSERT INTO cafes (name, place, detail) VALUES ("ブルーボトルコーヒー清澄白河フラッグシップカフェ", "清澄白河", "ブルーボトルコーヒの日本1号店。豆の原産地から抽出に至るまで各工程に拘ったコーヒを楽しむことができる。");
INSERT INTO cafes (name, place, detail) VALUES ("ARC", "蔵前", "本格的なコーヒとお菓子を楽しむことができるカフェ。店内な薄暗くインテリアもお洒落で洗練された雰囲気を感じることができる。");
INSERT INTO cafes (name, place, detail) VALUES ("Little Darling Coffee Roasters", "乃木坂", "店内には観葉植物、外には芝生が敷き詰められており都心にいながらも自然と触れ合うことができるカフェ。");
INSERT INTO cafes (name, place, detail) VALUES ("Connel Coffee", "青山一丁目", "平日のみ営業しているカフェ。全席にコンセントがあるため、作業カフェとしておすすめである。");
INSERT INTO cafes (name, place, detail) VALUES ("tallskogen", "清澄白河", "北欧系発酵料理が楽しめる。スウェーデン出身のオーナーが日本の食材や食文化を大切にしながら、未体験の味を作り出す。");
INSERT INTO cafes (name, place, detail) VALUES ("ナドヤノカッテ", "代々木上原", "希少なコーヒー豆を取り扱う古民家カフェ。");
