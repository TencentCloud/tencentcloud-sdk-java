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

public class FuseFaceRequest  extends AbstractModel{

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
若此参数不填写，则使用人脸融合控制台中脸型参数数值。
    */
    @SerializedName("FuseProfileDegree")
    @Expose
    private Integer FuseProfileDegree;

    /**
    * 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。
    */
    @SerializedName("FuseFaceDegree")
    @Expose
    private Integer FuseFaceDegree;

    /**
     * 获取活动 ID，请在人脸融合控制台查看。
     * @return ProjectId 活动 ID，请在人脸融合控制台查看。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置活动 ID，请在人脸融合控制台查看。
     * @param ProjectId 活动 ID，请在人脸融合控制台查看。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取素材 ID，请在人脸融合控制台查看。
     * @return ModelId 素材 ID，请在人脸融合控制台查看。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * 设置素材 ID，请在人脸融合控制台查看。
     * @param ModelId 素材 ID，请在人脸融合控制台查看。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * 获取返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     * @return RspImgType 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * 设置返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     * @param RspImgType 返回图像方式（url 或 base64) ，二选一。url有效期为30天。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * 获取用户人脸图片、素材模板图的人脸位置信息。
     * @return MergeInfos 用户人脸图片、素材模板图的人脸位置信息。
     */
    public MergeInfo [] getMergeInfos() {
        return this.MergeInfos;
    }

    /**
     * 设置用户人脸图片、素材模板图的人脸位置信息。
     * @param MergeInfos 用户人脸图片、素材模板图的人脸位置信息。
     */
    public void setMergeInfos(MergeInfo [] MergeInfos) {
        this.MergeInfos = MergeInfos;
    }

    /**
     * 获取脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。
     * @return FuseProfileDegree 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。
     */
    public Integer getFuseProfileDegree() {
        return this.FuseProfileDegree;
    }

    /**
     * 设置脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。
     * @param FuseProfileDegree 脸型融合比例，数值越高，融合后的脸型越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中脸型参数数值。
     */
    public void setFuseProfileDegree(Integer FuseProfileDegree) {
        this.FuseProfileDegree = FuseProfileDegree;
    }

    /**
     * 获取五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。
     * @return FuseFaceDegree 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。
     */
    public Integer getFuseFaceDegree() {
        return this.FuseFaceDegree;
    }

    /**
     * 设置五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。
     * @param FuseFaceDegree 五官融合比例，数值越高，融合后的五官越像素材人物。取值范围[0,100] 
若此参数不填写，则使用人脸融合控制台中五官参数数值。
     */
    public void setFuseFaceDegree(Integer FuseFaceDegree) {
        this.FuseFaceDegree = FuseFaceDegree;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamArrayObj(map, prefix + "MergeInfos.", this.MergeInfos);
        this.setParamSimple(map, prefix + "FuseProfileDegree", this.FuseProfileDegree);
        this.setParamSimple(map, prefix + "FuseFaceDegree", this.FuseFaceDegree);

    }
}

