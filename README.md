# VibeLab Android Sample

这是一个按你给的《VibeLab 应用提交与开发要求（v0.6）》整理出来的最小原生 Android 示例工程，适合直接作为 GitHub 仓库的基础模板继续开发。

## 已对齐的关键约束

- 单仓库单应用，工程根目录即仓库根目录
- 完整 Android Gradle 工程，保留 `gradle/` 与 Gradle Wrapper 文件
- 仅包含一个 `Application` module：`app`
- release 构建目标为唯一 APK
- 使用公开仓库依赖：`google()` + `mavenCentral()`
- 未提交 `local.properties`
- 未配置 release 签名、未提交 keystore 或密码
- 未在 `gradle.properties` 中设置 `org.gradle.java.home`
- Android 原生工程版本按文档约束设置：
  - Gradle Wrapper：8.13
  - AGP：8.13.0
  - compileSdk：35
  - targetSdk：35
  - minSdk：35
  - JDK：17

## 运行方式

1. 安装 JDK 17 与 Android SDK 35
2. 在项目根目录执行：
   - `./gradlew assembleRelease`
3. 产物默认位于：
   - `app/build/outputs/apk/release/`

## 应用内容

应用是一个单页面示例，主题是“VibeLab 提交前自检”：

- 展示通用提交约束
- 展示 Android 特定版本约束
- 提供一个简单的“我已阅读约束”交互按钮

如果你愿意，我可以下一步继续把它扩成：

- 更像产品 Demo 的界面
- 接入网络请求 / 列表 / 表单
- 按你指定的业务场景继续补功能
