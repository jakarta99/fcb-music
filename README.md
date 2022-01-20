# Course 2
## 使用 maven 建立一個專案
現代化 IDE 目前都有支援 maven, 
僅需要簡單地 new Maven Project 定義好自己的
groupId (組織名稱) 與 archifactId (專案名稱),
就可以開始使用 maven 專案.

透過編輯 pom.xml 檔案, 設定 <dependencies> 之中的 
<dependency> 就會自動從 cloud (mvnrepository) 下載相關的 
jar 檔案, 如果有相依關係的 jars 也會同步下載.

下載到的目錄預設是 /USRES/{YOUR_ROOT}/.m2 的目錄。IDE 之中的 Maven Dependencies 就會引用你設定的 jars 作為 Libaries. 專案內容就不需要包含 libs.

## 建立一個介面
以 Service Oriented Architecture (SOA) 的概念,
我們都是期望以服務驅動來設計系統,
將價值高的服務需求優先處理,
但是, 開發實作是需要時間的,
所以我們先定義好 interface,
把相關的 method 定義清楚,
也定義 input 與 output 的參數與物件,
如此, 我們就可以很快地讓各團隊共同合作.

```java
public interface MusicService {

  public Music getByCode(String code);
  
  public List<Music> getBySingerName(String singerName);
  
}
```

我們可以注意到, 在 interface 之中, 主要定義的是 public method, 以及 method 的 arguments 與 return value.

## 根據該介面進行實作
當我們要實作一個 interface, 就是寫一個 class 去 **implements** 該interface.

```
public MusicServiceImpl implements MusicService {
}
```

這時候, IDE 就會要求你一定要有 interface 之中所定義的所有 methods, 可以透過 IDE 自動產生這些 @Override 的 methods, 再進行實作。

## 建立 FAKE DATA
目前沒有連結資料庫, 也沒有檔案 I/O, 所以, 我們先在 constructor 之中建立假資料來進行測試.


## 集合
請自行閱讀 Java技術手冊 第九章 集合與 MAP

## HOMEWORK
自行建立一個 ObjectService 進行服務設計


