/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tiia.v20190529;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiia.v20190529.models.*;

public class TiiaClient extends AbstractClient{
    private static String endpoint = "tiia.tencentcloudapi.com";
    private static String service = "tiia";
    private static String version = "2019-05-29";

    public TiiaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiiaClient(Credential credential, String region, ClientProfile profile) {
        super(TiiaClient.endpoint, TiiaClient.version, credential, region, profile);
    }

    /**
     *评估输入图片在视觉上的质量，从多个方面评估，并同时给出综合的、客观的清晰度评分，和主观的美观度评分。

>   
- 可前往 [图像处理](https://cloud.tencent.com/document/product/1590) 产品文档中查看更多产品信息。
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req AssessQualityRequest
     * @return AssessQualityResponse
     * @throws TencentCloudSDKException
     */
    public AssessQualityResponse AssessQuality(AssessQualityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessQuality", AssessQualityResponse.class);
    }

    /**
     *本接口用于创建一个空的图片库，图片库主要用于存储在创建图片时提取的图片特征数据，如果图片库已存在则返回错误。不同的图片库类型对应不同的图像搜索服务类型，根据输入参数GroupType区分。

<table>
    <th>服务类型</th><th>GroupType</th><th>功能描述</th>
    <tr>
        <td>通用图像搜索</td>
        <td>4</td>
        <td>通用图像搜索1.0版。<br>在自建图片库中搜索相同原图或相似图片集，并给出相似度打分，可支持裁剪、翻转、调色、加水印等二次编辑后的图片搜索。适用于图片版权保护、原图查询等场景。</td>
    </tr>
    <tr>
        <td rowspan="3">商品图像搜索</td>
        <td>8</td>
         <td>商品图像搜索3.0升级版（推荐）。<br>
        在自建图库中搜索同款或相似商品，并给出相似度打分。对于服饰类商品可支持识别服饰类别、属性等信息。适用于商品分类、检索、推荐等电商场景。</td>
    </tr>   
 <tr>
        <td>7</td>
        <td>商品图像搜索2.0版。<br>
         功能和3.0升级版类似。</td>
    </tr>
     <tr>
        <td>5</td>
        <td>商品图像搜索1.0版。<br>
        功能和3.0升级版类似。</td>
    </tr>
    <tr>
    <td>图案花纹搜索</td><td>6</td><td>图案花纹搜索1.0版。<br>
    在自建图库中搜索相似的图案、logo、纹理等图像元素或主体，并给出相似度打分。</td>
    </tr>
</table>

- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
    }

    /**
     *创建图片，并添加对应图片的自定义信息。模型将在创建图片时自动提取图像特征并存储到指定的图片库中，每创建一张图片会对应提取和存储一条图片特征数据。

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImage", CreateImageResponse.class);
    }

    /**
     *根据输入的裁剪比例，智能判断一张图片的最佳裁剪区域，确保原图的主体区域不受影响，以适应不同平台、设备的展示要求，避免简单拉伸带来的变形。

>   
- 可前往 [图像处理](https://cloud.tencent.com/document/product/1590) 产品文档中查看更多产品信息。
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CropImageRequest
     * @return CropImageResponse
     * @throws TencentCloudSDKException
     */
    public CropImageResponse CropImage(CropImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CropImage", CropImageResponse.class);
    }

    /**
     *删除图片。

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req DeleteImagesRequest
     * @return DeleteImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagesResponse DeleteImages(DeleteImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImages", DeleteImagesResponse.class);
    }

    /**
     *查询所有的图库信息。

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req DescribeGroupsRequest
     * @return DescribeGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsResponse DescribeGroups(DescribeGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroups", DescribeGroupsResponse.class);
    }

    /**
     *获取指定图片库中的图片列表。

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *可对图片中厨师穿戴进行识别，支持厨师服识别，厨师帽识别，赤膊识别和口罩识别,可应用于明厨亮灶场景。
"被优选过滤"标签值在人体优选开关开启时才会返回。
厨师服：厨师服定义为白色上衣
厨师服识别(酒店版)：厨师服定义为红色，白色，黑色上衣

|序号 | 标签名称 | 标签值 |
| :-----|  :----------   |:-----------------  |
| 1 | 厨师服识别<div style="width: 70pt"/> |无厨师服、有厨师服、被优选过滤|
| 2 | 厨师服识别（酒店版）<div style="width: 70pt"/> |无厨师服、有厨师服、被优选过滤|
| 3 | 厨师帽识别<div style="width: 70pt"/> |无厨师帽、有厨师帽、被优选过滤	|
| 4 | 赤膊识别<div style="width: 70pt"/> |非赤膊、赤膊、被优选过滤|
| 5 | 口罩识别<div style="width: 70pt"/> |无口罩、有口罩、口罩不确定、被优选过滤	|
     * @param req DetectChefDressRequest
     * @return DetectChefDressResponse
     * @throws TencentCloudSDKException
     */
    public DetectChefDressResponse DetectChefDress(DetectChefDressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectChefDress", DetectChefDressResponse.class);
    }

    /**
     *输入一张图片，返回AI针对一张图片是否是恶心的一系列判断值。

通过恶心图片识别, 可以判断一张图片是否令人恶心, 同时给出它属于的潜在类别, 让您能够过滤掉使人不愉快的图片。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectDisgustRequest
     * @return DetectDisgustResponse
     * @throws TencentCloudSDKException
     */
    public DetectDisgustResponse DetectDisgust(DetectDisgustRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectDisgust", DetectDisgustResponse.class);
    }

    /**
     *文件封识别可检测图片中是否包含符合文件封（即文件、单据、资料等的袋状包装）特征的物品，覆盖顺丰快递文件封、文件袋、档案袋等多种文件封类型，可应用于物流行业对文件快递的包装审核等场景。

>?   
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectEnvelopeRequest
     * @return DetectEnvelopeResponse
     * @throws TencentCloudSDKException
     */
    public DetectEnvelopeResponse DetectEnvelope(DetectEnvelopeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectEnvelope", DetectEnvelopeResponse.class);
    }

    /**
     *图像标签利用深度学习技术，可以对图片进行智能分类、物体识别等。

目前支持八个大类、六十多个子类、数千个标签，涵盖各种日常场景、动植物、物品、美食等。

图像标签提供四个版本供选择：

• 摄像头版：针对搜索、手机摄像头照片进行优化，涵盖大量卡证、日常物品、二维码条形码。

• 相册版：针对手机相册、网盘进行优化，去除相册和网盘中不常见的标签，针对相册常见图片类型（人像、日常活动、日常物品等）识别效果更好。

• 网络版：针对网络图片进行优化，涵盖标签更多，满足长尾识别需求。

• 新闻版：针对新闻、资讯、广电等行业进行优化，增加定制识别，支持万级图像标签。

为了方便使用、减少图片传输次数，图像标签将不同版本包装成多合一接口，实际上是多个服务，分别计费。建议在接入初期，对四个版本进行对比评估后选择合适的版本使用。

>?
- 图像标签已升级服务，建议使用新版接口[通用图像标签](https://cloud.tencent.com/document/product/865/75196)。
- 图像标签摄像头版、相册版、网络版、新闻版分别按照各自的实际使用次数进行收费，例如一张图片同时使用相册版、摄像头版，则按照两次调用计费。建议测试对比后从中选择一个最合适的版本使用即可。

>   
- 可前往 [图像标签](https://cloud.tencent.com/document/product/1588) 产品文档中查看更多产品信息。
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectLabelRequest
     * @return DetectLabelResponse
     * @throws TencentCloudSDKException
     */
    public DetectLabelResponse DetectLabel(DetectLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectLabel", DetectLabelResponse.class);
    }

    /**
     *通用图像标签可识别数千种常见物体或场景，覆盖日常物品、场景、动物、植物、食物、饮品、交通工具等多个大类，返回主体的标签名称和所属细分类目等。

>   
- 可前往 [图像标签](https://cloud.tencent.com/document/product/1588) 产品文档中查看更多产品信息。
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectLabelProRequest
     * @return DetectLabelProResponse
     * @throws TencentCloudSDKException
     */
    public DetectLabelProResponse DetectLabelPro(DetectLabelProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectLabelPro", DetectLabelProResponse.class);
    }

    /**
     *可以识别输入的图片中是否包含不良行为，例如打架斗殴、赌博、抽烟等，可以应用于广告图、直播截图、短视频截图等审核，减少不良行为对平台内容质量的影响，维护健康向上的互联网环境。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectMisbehaviorRequest
     * @return DetectMisbehaviorResponse
     * @throws TencentCloudSDKException
     */
    public DetectMisbehaviorResponse DetectMisbehavior(DetectMisbehaviorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectMisbehavior", DetectMisbehaviorResponse.class);
    }

    /**
     *传入一张图片，识别出图片中是否存在宠物
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectPetRequest
     * @return DetectPetResponse
     * @throws TencentCloudSDKException
     */
    public DetectPetResponse DetectPet(DetectPetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectPet", DetectPetResponse.class);
    }

    /**
     *本接口支持识别图片中包含的商品，能够输出商品的品类名称、类别，还可以输出商品在图片中的位置。支持一张图片多个商品的识别。
>?    
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectProductRequest
     * @return DetectProductResponse
     * @throws TencentCloudSDKException
     */
    public DetectProductResponse DetectProduct(DetectProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectProduct", DetectProductResponse.class);
    }

    /**
     *安全属性识别可对图片中人体安全防护属性进行识别，支持识别安全帽，反光衣，护目镜，工服，手套，工地安全带，口罩，抽烟，玩手机等多种属性。
"被优选过滤"标签值在人体优选开关开启时才会返回。

|序号 | 标签名称 | 标签值 |
| :-----|  :----------   |:-----------------  |
| 1 | 安全帽识别<div style="width: 70pt"/> |无安全帽、有安全帽、被优选过滤|
| 2 | 玩手机识别<div style="width: 70pt"/> |没有电话、打电话、玩手机、被优选过滤|
| 3 | 抽烟识别<div style="width: 70pt"/> |没有抽烟、抽烟、被优选过滤	|
| 4 | 口罩识别<div style="width: 70pt"/> |无口罩、有口罩、口罩不确定、被优选过滤|
| 5 | 工地安全带识别<div style="width: 70pt"/> |无工地安全带、工地安全带、被优选过滤	|
| 6 | 手套识别<div style="width: 70pt"/> |无手套、有手套、手套不确定、被优选过滤	|
| 7 | 工服识别<div style="width: 70pt"/> |无工服、有工服、被优选过滤|
| 8 | 护目镜识别<div style="width: 70pt"/> |无护目镜、有护目镜、被优选过滤|
| 9 | 反光衣识别<div style="width: 70pt"/> |无反光衣、有反光衣、被优选过滤|
     * @param req DetectSecurityRequest
     * @return DetectSecurityResponse
     * @throws TencentCloudSDKException
     */
    public DetectSecurityResponse DetectSecurity(DetectSecurityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectSecurity", DetectSecurityResponse.class);
    }

    /**
     *传入一张图片，输出清晰度提升后的图片。

可以消除图片有损压缩导致的噪声，和使用滤镜、拍摄失焦导致的模糊。让图片的边缘和细节更加清晰自然。

>   
- 可前往 [图像处理](https://cloud.tencent.com/document/product/1590) 产品文档中查看更多产品信息。
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req EnhanceImageRequest
     * @return EnhanceImageResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceImageResponse EnhanceImage(EnhanceImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnhanceImage", EnhanceImageResponse.class);
    }

    /**
     *车辆识别可对图片中车辆的车型进行识别，输出车辆的品牌（如路虎）、车系（如神行者2）、类型（如中型SUV）、颜色和车辆在图中的坐标等信息，覆盖轿车、SUV、大型客车等市面常见车，支持三千多种车辆型号。如果图片中存在多辆车，会分别输出每辆车的车型和坐标。

>?   
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req RecognizeCarRequest
     * @return RecognizeCarResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeCarResponse RecognizeCar(RecognizeCarRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeCar", RecognizeCarResponse.class);
    }

    /**
     *车辆识别（增强版）在车辆识别的基础上**增加了车牌识别的功能，并升级了车型识别的效果**。可对图片中车辆的车型和车牌进行同时识别，输出车辆的车牌信息，以及车辆品牌（如路虎）、车系（如神行者2）、类型（如中型SUV）、颜色和车辆在图中的坐标等信息，覆盖轿车、SUV、大型客车等市面常见车，支持三千多种车辆型号。如果图片中存在多辆车，会分别输出每辆车的车型、车牌和坐标。

>?   
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req RecognizeCarProRequest
     * @return RecognizeCarProResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeCarProResponse RecognizeCarPro(RecognizeCarProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeCarPro", RecognizeCarProResponse.class);
    }

    /**
     *本接口用于对一张图片，在指定图片库中检索出与之相似的图片列表。

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req SearchImageRequest
     * @return SearchImageResponse
     * @throws TencentCloudSDKException
     */
    public SearchImageResponse SearchImage(SearchImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchImage", SearchImageResponse.class);
    }

    /**
     *本接口支持根据图库ID、物品ID、图片名称来修改图片信息（暂仅支持修改Tags）

>   
- 可前往 [图像搜索](https://cloud.tencent.com/document/product/1589) 产品文档中查看更多产品信息。
     * @param req UpdateImageRequest
     * @return UpdateImageResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageResponse UpdateImage(UpdateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateImage", UpdateImageResponse.class);
    }

}
