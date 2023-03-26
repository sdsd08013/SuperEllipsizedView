[![](https://jitpack.io/v/sdsd08013/SuperEllipsizedView.svg)](https://jitpack.io/#sdsd08013/SuperEllipsizedView)


# SuperEllipsizedView
superellipsizedview supports only MaterialButton and ShapableImageView.
width and height should be same and radius should be half of those.

## Getting Started
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

```groovy
dependencies {
    implementation 'com.github.sdsd08013:SuperEllipsizedView:Tag'
}
```
## How to use
### MaterialButton

```xml
<SuperEllipsizedMaterialButton
    android:id=“@+id/icon”
    android:layout_width=“44dp”
    android:layout_height=“44dp”
    android:layout_marginTop=“8dp”
    android:backgroundTint=“@color/colorPrimary”
    app:exponent=“5"
    app:icon=“@drawable/ic_setting”
    app:iconGravity=“textStart”
    app:iconPadding=“0dp”
    app:iconSize=“44dp”
    app:iconTint=“@null”
    app:radius=“22dp” />
```
### ImageView
```xml
<SuperEllipsizedImage
    android:id=“@+id/user_icon”
    android:layout_width=“44dp”
    android:layout_height=“44dp”
    android:layout_margin=“@dimen/spacing_small”
    app:radius=“22dp”
    app:exponent=“5"
    app:layout_constraintTop_toTopOf=“parent”
    app:layout_constraintBottom_toBottomOf=“parent”
    app:layout_constraintEnd_toEndOf=“parent”
/>
```
