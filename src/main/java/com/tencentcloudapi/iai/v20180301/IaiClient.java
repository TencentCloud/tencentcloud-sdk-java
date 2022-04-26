/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.iai.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iai.v20180301.models.*;

public class IaiClient extends AbstractClient{
    private static String endpoint = "iai.tencentcloudapi.com";
    private static String service = "iai";
    private static String version = "2018-03-01";

    public IaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IaiClient(Credential credential, String region, ClientProfile profile) {
        super(IaiClient.endpoint, IaiClient.version, credential, region, profile);
    }

    /**
     *对请求图片进行五官定位（也称人脸关键点定位），获得人脸的精准信息，返回多达888点关键信息，对五官和脸部轮廓进行精确定位。
     * @param req AnalyzeDenseLandmarksRequest
     * @return AnalyzeDenseLandmarksResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeDenseLandmarksResponse AnalyzeDenseLandmarks(AnalyzeDenseLandmarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeDenseLandmarksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeDenseLandmarksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AnalyzeDenseLandmarks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对请求图片进行五官定位（也称人脸关键点定位），计算构成人脸轮廓的 90 个点，包括眉毛（左右各 8 点）、眼睛（左右各 8 点）、鼻子（13 点）、嘴巴（22 点）、脸型轮廓（21 点）、眼珠[或瞳孔]（2点）。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req AnalyzeFaceRequest
     * @return AnalyzeFaceResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeFaceResponse AnalyzeFace(AnalyzeFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AnalyzeFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对两张图片中的人脸进行相似度比对，返回人脸相似度分数。

若您需要判断 “此人是否是某人”，即验证某张图片中的人是否是已知身份的某人，如常见的人脸登录场景，建议使用[人脸验证](https://cloud.tencent.com/document/product/867/32806)或[人员验证](https://cloud.tencent.com/document/product/867/38879)接口。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CompareFaceRequest
     * @return CompareFaceResponse
     * @throws TencentCloudSDKException
     */
    public CompareFaceResponse CompareFace(CompareFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompareFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompareFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompareFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将已存在于某人员库的人员复制到其他人员库，该人员的描述信息不会被复制。单个人员最多只能同时存在100个人员库中。
>     
- 注：若该人员创建时算法模型版本为2.0，复制到非2.0算法模型版本的Group中时，复制操作将会失败。
     * @param req CopyPersonRequest
     * @return CopyPersonResponse
     * @throws TencentCloudSDKException
     */
    public CopyPersonResponse CopyPerson(CopyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyPersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将一组人脸图片添加到一个人员中。一个人员最多允许包含 5 张图片。若该人员存在多个人员库中，所有人员库中该人员图片均会增加。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建一个空的人员库，如果人员库已存在返回错误。
可根据需要创建自定义描述字段，用于辅助描述该人员库下的人员信息。

1个APPID下最多创建10万个人员库（Group）、最多包含5000万张人脸（Face）。

不同算法模型版本（FaceModelVersion）的人员库（Group）最多可包含人脸（Face）数不同。算法模型版本为2.0的人员库最多包含100万张人脸，算法模型版本为3.0的人员库最多可包含300万张人脸。
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人员，添加人脸、姓名、性别及其他相关信息。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个人员下的人脸图片。如果该人员只有一张人脸图片，则返回错误。
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除该人员库及包含的所有的人员。同时，人员对应的所有人脸信息将被删除。若某人员同时存在多个人员库中，该人员不会被删除，但属于该人员库中的自定义描述字段信息会被删除，属于其他人员库的自定义描述字段信息不受影响。

     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除该人员信息，此操作会导致所有人员库均删除此人员。同时，该人员的所有人脸信息将被删除。
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从某人员库中删除人员，此操作仅影响该人员库。若该人员仅存在于指定的人员库中，该人员将被删除，其所有的人脸信息也将被删除。
     * @param req DeletePersonFromGroupRequest
     * @return DeletePersonFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonFromGroupResponse DeletePersonFromGroup(DeletePersonFromGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonFromGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonFromGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePersonFromGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测给定图片中的人脸（Face）的位置、相应的面部属性和人脸质量信息，位置包括 (x，y，w，h)，面部属性包括性别（gender）、年龄（age）、表情（expression）、魅力（beauty）、眼镜（glass）、发型（hair）、口罩（mask）和姿态 (pitch，roll，yaw)，人脸质量信息包括整体质量分（score）、模糊分（sharpness）、光照分（brightness）和五官遮挡分（completeness）。

 
其中，人脸质量信息主要用于评价输入的人脸图片的质量。在使用人脸识别服务时，建议您对输入的人脸图片进行质量检测，提升后续业务处理的效果。该功能的应用场景包括：

1） 人员库[创建人员](https://cloud.tencent.com/document/product/867/32793)/[增加人脸](https://cloud.tencent.com/document/product/867/32795)：保证人员人脸信息的质量，便于后续的业务处理。

2） [人脸搜索](https://cloud.tencent.com/document/product/867/32798)：保证输入的图片质量，快速准确匹配到对应的人员。

3） [人脸验证](https://cloud.tencent.com/document/product/867/32806)：保证人脸信息的质量，避免明明是本人却认证不通过的情况。

4） [人脸融合](https://cloud.tencent.com/product/facefusion)：保证上传的人脸质量，人脸融合的效果更好。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。


     * @param req DetectFaceRequest
     * @return DetectFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceResponse DetectFace(DetectFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测给定图片中的人脸（Face）的位置、相应的面部属性和人脸质量信息，位置包括 (x，y，w，h)，面部属性包括性别（gender）、年龄（age）、表情（expression）、魅力（beauty）、眼镜（glass）、发型（hair）、口罩（mask）和姿态 (pitch，roll，yaw)，人脸质量信息包括整体质量分（score）、模糊分（sharpness）、光照分（brightness）和五官遮挡分（completeness）。

 
其中，人脸质量信息主要用于评价输入的人脸图片的质量。在使用人脸识别服务时，建议您对输入的人脸图片进行质量检测，提升后续业务处理的效果。该功能的应用场景包括：

1） 人员库[创建人员](https://cloud.tencent.com/document/product/867/32793)/[增加人脸](https://cloud.tencent.com/document/product/867/32795)：保证人员人脸信息的质量，便于后续的业务处理。

2） [人脸搜索](https://cloud.tencent.com/document/product/867/32798)：保证输入的图片质量，快速准确匹配到对应的人员。

3） [人脸验证](https://cloud.tencent.com/document/product/867/32806)：保证人脸信息的质量，避免明明是本人却认证不通过的情况。

4） [人脸融合](https://cloud.tencent.com/product/facefusion)：保证上传的人脸质量，人脸融合的效果更好。

>     
- 本接口是[人脸检测与分析](https://cloud.tencent.com/document/product/867/32800)的升级，具体在于：

1.本接口可以指定需要计算返回的人脸属性，避免无效计算，降低耗时；

2.本接口支持更多属性细项数，也会持续增加更多功能。

请您使用本接口完成相应的人脸检测与属性分析需求。

- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceAttributesResponse DetectFaceAttributes(DetectFaceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFaceAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFaceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectFaceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对用户上传的静态图片进行人脸活体检测。与动态活体检测的区别是：静态活体检测中，用户不需要通过唇语或摇头眨眼等动作来识别。

静态活体检测适用于手机自拍的场景，或对防攻击要求不高的场景。如果对活体检测有更高安全性要求，请使用[人脸核身·云智慧眼](https://cloud.tencent.com/product/faceid)产品。

>     
- 图片的宽高比请接近3：4，不符合宽高比的图片返回的分值不具备参考意义。本接口适用于类手机自拍场景，非类手机自拍照返回的分值不具备参考意义。

>
- 使用过程中建议正对摄像头，不要距离太远，使面部可以完整地显示在识别的框内，识别过程中不要移动设备或遮挡面部。不要选择光线过强或过弱的环境进行面部识别，识别时不要添加任何滤镜。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectLiveFaceRequest
     * @return DetectLiveFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectLiveFaceResponse DetectLiveFace(DetectLiveFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectLiveFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectLiveFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectLiveFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员库信息。
     * @param req GetGroupInfoRequest
     * @return GetGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员库列表。
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员的信息，包括姓名、性别、人脸等。
     * @param req GetPersonBaseInfoRequest
     * @return GetPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonBaseInfoResponse GetPersonBaseInfo(GetPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonBaseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonBaseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPersonBaseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员的信息，包括加入的人员库、描述内容等。
     * @param req GetPersonGroupInfoRequest
     * @return GetPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonGroupInfoResponse GetPersonGroupInfo(GetPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPersonGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员库中的人员列表。
     * @param req GetPersonListRequest
     * @return GetPersonListResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListResponse GetPersonList(GetPersonListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPersonList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员库中人员数量。
     * @param req GetPersonListNumRequest
     * @return GetPersonListNumResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListNumResponse GetPersonListNum(GetPersonListNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListNumResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListNumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPersonListNum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员库升级任务列表

     * @param req GetUpgradeGroupFaceModelVersionJobListRequest
     * @return GetUpgradeGroupFaceModelVersionJobListResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeGroupFaceModelVersionJobListResponse GetUpgradeGroupFaceModelVersionJobList(GetUpgradeGroupFaceModelVersionJobListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUpgradeGroupFaceModelVersionJobListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUpgradeGroupFaceModelVersionJobListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUpgradeGroupFaceModelVersionJobList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *人员库升级结果查询

     * @param req GetUpgradeGroupFaceModelVersionResultRequest
     * @return GetUpgradeGroupFaceModelVersionResultResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeGroupFaceModelVersionResultResponse GetUpgradeGroupFaceModelVersionResult(GetUpgradeGroupFaceModelVersionResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUpgradeGroupFaceModelVersionResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUpgradeGroupFaceModelVersionResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUpgradeGroupFaceModelVersionResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员库名称、备注、自定义描述字段名称。
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员信息，包括名称、性别等。人员名称和性别修改会同步到包含该人员的所有人员库。
     * @param req ModifyPersonBaseInfoRequest
     * @return ModifyPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonBaseInfoResponse ModifyPersonBaseInfo(ModifyPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonBaseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonBaseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPersonBaseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定人员库人员描述内容。
     * @param req ModifyPersonGroupInfoRequest
     * @return ModifyPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonGroupInfoResponse ModifyPersonGroupInfo(ModifyPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPersonGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于回滚人员库的人脸识别算法模型版本。单个人员库有且仅有一次回滚机会。

回滚操作会在10s内生效，回滚操作中，您对人员库的操作可能会失效。
     * @param req RevertGroupFaceModelVersionRequest
     * @return RevertGroupFaceModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public RevertGroupFaceModelVersionResponse RevertGroupFaceModelVersion(RevertGroupFaceModelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevertGroupFaceModelVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevertGroupFaceModelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevertGroupFaceModelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopK 人员，识别结果按照相似度从大到小排序。

支持一次性识别图片中的最多 10 张人脸，支持一次性跨 100 个人员库（Group）搜索。

单次搜索的人员库人脸总数量和人员库的算法模型版本（FaceModelVersion）相关。算法模型版本为2.0的人员库，单次搜索人员库人脸总数量不得超过 100 万张；算法模型版本为3.0的人员库，单次搜索人员库人脸总数量不得超过 300 万张。

与[人员搜索](https://cloud.tencent.com/document/product/867/38881)及[人员搜索按库返回](https://cloud.tencent.com/document/product/867/38880)接口不同的是，本接口将该人员（Person）下的每个人脸（Face）都作为单独个体进行验证，而人员搜索及人员搜索按库返回接口 会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个Person下有4张 Face，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使搜索更加准确。


本接口需与[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)结合使用。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req SearchFacesRequest
     * @return SearchFacesResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesResponse SearchFaces(SearchFacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchFaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopK 人员，按照**人员库的维度**以人员相似度从大到小顺序排列。

支持一次性识别图片中的最多 10 张人脸，支持跨人员库（Group）搜索。

单次搜索的人员库人脸总数量和人员库的算法模型版本（FaceModelVersion）相关。算法模型版本为2.0的人员库，单次搜索人员库人脸总数量不得超过 100 万张；算法模型版本为3.0的人员库，单次搜索人员库人脸总数量不得超过 300 万张。

与[人员搜索](https://cloud.tencent.com/document/product/867/38881)及[人员搜索按库返回](https://cloud.tencent.com/document/product/867/38880)接口不同的是，本接口将该人员（Person）下的每个人脸（Face）都作为单独个体进行验证，而[人员搜索](https://cloud.tencent.com/document/product/867/38881)及[人员搜索按库返回](https://cloud.tencent.com/document/product/867/38880)接口 会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个Person下有4张 Face，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使搜索更加准确。

本接口需与[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)结合使用。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。


     * @param req SearchFacesReturnsByGroupRequest
     * @return SearchFacesReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesReturnsByGroupResponse SearchFacesReturnsByGroup(SearchFacesReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesReturnsByGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesReturnsByGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchFacesReturnsByGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopK 人员，按照相似度从大到小排列。

支持一次性识别图片中的最多 10 张人脸，支持一次性跨 100 个人员库（Group）搜索。

单次搜索的人员库人脸总数量和人员库的算法模型版本（FaceModelVersion）相关。算法模型版本为2.0的人员库，单次搜索人员库人脸总数量不得超过 100 万张；算法模型版本为3.0的人员库，单次搜索人员库人脸总数量不得超过 300 万张。

本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个 Person 下有4张 Face ，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员搜索（确定待识别的人脸图片是某人）更加准确。而[人脸搜索](https://cloud.tencent.com/document/product/867/32798)及[人脸搜索按库返回接口](https://cloud.tencent.com/document/product/867/38882)将该人员（Person）下的每个人脸（Face）都作为单独个体进行搜索。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
- 仅支持算法模型版本（FaceModelVersion）为3.0的人员库。
     * @param req SearchPersonsRequest
     * @return SearchPersonsResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsResponse SearchPersons(SearchPersonsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchPersons");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopK 人员，按照**人员库的维度**以人员相似度从大到小顺序排列。

支持一次性识别图片中的最多 10 张人脸，支持跨人员库（Group）搜索。

单次搜索的人员库人脸总数量和人员库的算法模型版本（FaceModelVersion）相关。算法模型版本为2.0的人员库，单次搜索人员库人脸总数量不得超过 100 万张；算法模型版本为3.0的人员库，单次搜索人员库人脸总数量不得超过 300 万张。

本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个 Person 下有4张 Face ，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员搜索（确定待识别的人脸图片是某人）更加准确。而[人脸搜索](https://cloud.tencent.com/document/product/867/32798)及[人脸搜索按库返回接口](https://cloud.tencent.com/document/product/867/38882)将该人员（Person）下的每个人脸（Face）都作为单独个体进行搜索。
>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
- 仅支持算法模型版本（FaceModelVersion）为3.0的人员库。
     * @param req SearchPersonsReturnsByGroupRequest
     * @return SearchPersonsReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsReturnsByGroupResponse SearchPersonsReturnsByGroup(SearchPersonsReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsReturnsByGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsReturnsByGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchPersonsReturnsByGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级人员库。升级过程中，人员库仍然为原算法版本，人员库相关操作仍然支持。升级完成后，人员库为新算法版本。
单个人员库有且仅支持一次回滚操作。
注：此处QPS限制为10。
     * @param req UpgradeGroupFaceModelVersionRequest
     * @return UpgradeGroupFaceModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGroupFaceModelVersionResponse UpgradeGroupFaceModelVersion(UpgradeGroupFaceModelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGroupFaceModelVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGroupFaceModelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGroupFaceModelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给定一张人脸图片和一个 PersonId，判断图片中的人和 PersonId 对应的人是否为同一人。PersonId 请参考[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)。 

与[人脸比对](https://cloud.tencent.com/document/product/867/32802)接口不同的是，人脸验证用于判断 “此人是否是此人”，“此人”的信息已存于人员库中，“此人”可能存在多张人脸图片；而[人脸比对](https://cloud.tencent.com/document/product/867/32802)用于判断两张人脸的相似度。

与[人员验证](https://cloud.tencent.com/document/product/867/38879)接口不同的是，人脸验证将该人员（Person）下的每个人脸（Face）都作为单独个体进行验证，而[人员验证](https://cloud.tencent.com/document/product/867/38879)会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个 Person下有4张 Face，人员验证接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员验证（确定待识别的人脸图片是某人员）更加准确。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req VerifyFaceRequest
     * @return VerifyFaceResponse
     * @throws TencentCloudSDKException
     */
    public VerifyFaceResponse VerifyFace(VerifyFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给定一张人脸图片和一个 PersonId，判断图片中的人和 PersonId 对应的人是否为同一人。PersonId 请参考[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)。
本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个Person下有4张 Face，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员验证（确定待识别的人脸图片是某人员）更加准确。

 和人脸比对相关接口不同的是，人脸验证相关接口用于判断 “此人是否是此人”，“此人”的信息已存于人员库中，“此人”可能存在多张人脸图片；而人脸比对相关接口用于判断两张人脸的相似度。


>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
- 仅支持算法模型版本（FaceModelVersion）为3.0的人员库。
     * @param req VerifyPersonRequest
     * @return VerifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPersonResponse VerifyPerson(VerifyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
