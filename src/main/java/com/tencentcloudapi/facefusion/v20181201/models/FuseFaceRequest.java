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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceRequest extends AbstractModel{

    /**
    * 活动 ID，请在人脸融合控制台查看。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 素材 ID，请在人脸融合控制台查看。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * 用户人脸图片、素材模板图的人脸位置信息。
    */
    @SerializedName("MergeInfos")
    @Expose
    private MergeInfo [] MergeInfos;

    /**
    * 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。（换脸版算法暂不支持此参数调整）
    */
    @SerializedName("FuseProfileDegree")
    @Expose
    private Long FuseProfileDegree;

    /**
    * 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。（换脸版算法暂不支持此参数调整）
    */
    @SerializedName("FuseFaceDegree")
    @Expose
    private Long FuseFaceDegree;

    /**
    * 0表示不需要鉴政，1表示需要鉴政。默认值为0。
请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
    */
    @SerializedName("CelebrityIdentify")
    @Expose
    private Long CelebrityIdentify;

    /**
     * Get 活动 ID，请在人脸融合控制台查看。 
     * @return ProjectId 活动 ID，请在人脸融合控制台查看。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 活动 ID，请在人脸融合控制台查看。
     * @param ProjectId 活动 ID，请在人脸融合控制台查看。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 素材 ID，请在人脸融合控制台查看。 
     * @return ModelId 素材 ID，请在人脸融合控制台查看。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 素材 ID，请在人脸融合控制台查看。
     * @param ModelId 素材 ID，请在人脸融合控制台查看。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 返回图像方式（url 或 base64) ，二选一。url有效期为30天。 
     * @return RspImgType 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     * @param RspImgType 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * Get 用户人脸图片、素材模板图的人脸位置信息。 
     * @return MergeInfos 用户人脸图片、素材模板图的人脸位置信息。
     */
    public MergeInfo [] getMergeInfos() {
        return this.MergeInfos;
    }

    /**
     * Set 用户人脸图片、素材模板图的人脸位置信息。
     * @param MergeInfos 用户人脸图片、素材模板图的人脸位置信息。
     */
    public void setMergeInfos(MergeInfo [] MergeInfos) {
        this.MergeInfos = MergeInfos;
    }

    /**
     * Get 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。（换脸版算法暂不支持此参数调整） 
     * @return FuseProfileDegree 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。（换脸版算法暂不支持此参数调整）
     */
    public Long getFuseProfileDegree() {
        return this.FuseProfileDegree;
    }

    /**
     * Set 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。（换脸版算法暂不支持此参数调整）
     * @param FuseProfileDegree 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。（换脸版算法暂不支持此参数调整）
     */
    public void setFuseProfileDegree(Long FuseProfileDegree) {
        this.FuseProfileDegree = FuseProfileDegree;
    }

    /**
     * Get 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。（换脸版算法暂不支持此参数调整） 
     * @return FuseFaceDegree 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。（换脸版算法暂不支持此参数调整）
     */
    public Long getFuseFaceDegree() {
        return this.FuseFaceDegree;
    }

    /**
     * Set 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。（换脸版算法暂不支持此参数调整）
     * @param FuseFaceDegree 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。（换脸版算法暂不支持此参数调整）
     */
    public void setFuseFaceDegree(Long FuseFaceDegree) {
        this.FuseFaceDegree = FuseFaceDegree;
    }

    /**
     * Get 0表示不需要鉴政，1表示需要鉴政。默认值为0。
请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。 
     * @return CelebrityIdentify 0表示不需要鉴政，1表示需要鉴政。默认值为0。
请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     */
    public Long getCelebrityIdentify() {
        return this.CelebrityIdentify;
    }

    /**
     * Set 0表示不需要鉴政，1表示需要鉴政。默认值为0。
请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     * @param CelebrityIdentify 0表示不需要鉴政，1表示需要鉴政。默认值为0。
请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     */
    public void setCelebrityIdentify(Long CelebrityIdentify) {
        this.CelebrityIdentify = CelebrityIdentify;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamArrayObj(map, prefix + "MergeInfos.", this.MergeInfos);
        this.setParamSimple(map, prefix + "FuseProfileDegree", this.FuseProfileDegree);
        this.setParamSimple(map, prefix + "FuseFaceDegree", this.FuseFaceDegree);
        this.setParamSimple(map, prefix + "CelebrityIdentify", this.CelebrityIdentify);

    }
}

