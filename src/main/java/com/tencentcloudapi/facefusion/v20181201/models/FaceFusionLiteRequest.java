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

public class FaceFusionLiteRequest extends AbstractModel{

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
    * 用户人脸图片、素材模板图的人脸位置信息。
    */
    @SerializedName("MergeInfos")
    @Expose
    private MergeInfo [] MergeInfos;

    /**
    * 返回图像方式（url 或 base64) ，二选一。默认url, url有效期为30天。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * 请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
    */
    @SerializedName("CelebrityIdentify")
    @Expose
    private Long CelebrityIdentify;

    /**
    * 算法引擎参数:  1）选脸版 - youturecreat; 2）优享版 - youtu1vN； 3）畅享版 - ptu； 4）随机 - ALL;  默认为活动选择的算法
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

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
     * Get 返回图像方式（url 或 base64) ，二选一。默认url, url有效期为30天。 
     * @return RspImgType 返回图像方式（url 或 base64) ，二选一。默认url, url有效期为30天。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set 返回图像方式（url 或 base64) ，二选一。默认url, url有效期为30天。
     * @param RspImgType 返回图像方式（url 或 base64) ，二选一。默认url, url有效期为30天。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * Get 请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。 
     * @return CelebrityIdentify 请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     */
    public Long getCelebrityIdentify() {
        return this.CelebrityIdentify;
    }

    /**
     * Set 请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     * @param CelebrityIdentify 请注意，鉴政服务开启后，您需要根据返回结果自行判断是否调整您的业务逻辑。例如提示您的用户图片非法，请更换图片。
     */
    public void setCelebrityIdentify(Long CelebrityIdentify) {
        this.CelebrityIdentify = CelebrityIdentify;
    }

    /**
     * Get 算法引擎参数:  1）选脸版 - youturecreat; 2）优享版 - youtu1vN； 3）畅享版 - ptu； 4）随机 - ALL;  默认为活动选择的算法 
     * @return Engine 算法引擎参数:  1）选脸版 - youturecreat; 2）优享版 - youtu1vN； 3）畅享版 - ptu； 4）随机 - ALL;  默认为活动选择的算法
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 算法引擎参数:  1）选脸版 - youturecreat; 2）优享版 - youtu1vN； 3）畅享版 - ptu； 4）随机 - ALL;  默认为活动选择的算法
     * @param Engine 算法引擎参数:  1）选脸版 - youturecreat; 2）优享版 - youtu1vN； 3）畅享版 - ptu； 4）随机 - ALL;  默认为活动选择的算法
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public FaceFusionLiteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceFusionLiteRequest(FaceFusionLiteRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.MergeInfos != null) {
            this.MergeInfos = new MergeInfo[source.MergeInfos.length];
            for (int i = 0; i < source.MergeInfos.length; i++) {
                this.MergeInfos[i] = new MergeInfo(source.MergeInfos[i]);
            }
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
        if (source.CelebrityIdentify != null) {
            this.CelebrityIdentify = new Long(source.CelebrityIdentify);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArrayObj(map, prefix + "MergeInfos.", this.MergeInfos);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamSimple(map, prefix + "CelebrityIdentify", this.CelebrityIdentify);
        this.setParamSimple(map, prefix + "Engine", this.Engine);

    }
}

