package composition;

/**
 * @author: yyWang
 * @create: 2019/10/10
 * @description: 合成/ 聚合原则:尽量使用合成/聚合，而不是使用类继承
 * 合成(Composition)，和聚合（Aggregation）都是关联的特殊种类。
 * 聚合表示一种弱的"拥有"关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分。
 * 合成是一种强的“拥有”关系，体现了严格的部分和整体的关系，部分和整体的生命周期一样。
 * 合成/聚合复用原则优点：优先使用对象的合成/聚合将有助于保持每个类被封装，并被集中在
 * 单个任务上，这样类和类继承层次会保持较小规模。
 */

public abstract class HandsetSoft {
    // 使用 手机院级和手机品牌来展示合成/聚合原则。
    public abstract void Run();
}
