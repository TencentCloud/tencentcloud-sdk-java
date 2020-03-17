### 3.1.16

我们添加了对公共参数Language的支持，以满足部分产品国际化的诉求。和以前一样，Language默认不传，行为由各产品接口自行决定，通常是中文的，但也有默认英文的。目前可选值为中文或者英文，通过如下方法设置：

```
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.Language;
...
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setLanguage(Language.ZH_CN);
```

### 3.1.0 (2020-02-18)

之前我们将各产品接口定义的数值型参数，都统一实现为Integer。但是实际使用中，我们发现很多整形数值溢出的情况，业务实际是使用了64位整数。最开始我们对发现的例子做了特殊处理，改为了Long型。后来发现越来越多，特殊处理已经不太现实，于是我们挑选了部分使用较为活跃的产品，全部修改为Long型，经过半年左右并无收到负面反馈。因此这次冒险全部修改为Long型。

如果您从3.0.x版本升级到了3.1.x版本，将会面临兼容型问题。您需要重新编译项目，将使用到的接口定义中的Integer转变为Long进行处理。
