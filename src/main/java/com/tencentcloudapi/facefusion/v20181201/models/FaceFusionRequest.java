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

public class FaceFusionRequest  extends AbstractModel{

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
    * 图片 base64 数据。请确保人脸为正脸，无旋转。若某些手机拍摄后人脸被旋转，请使用图片的 EXIF 信息对图片进行旋转处理；请勿在 base64 数据中包含头部，如“data:image/jpeg;base64,”。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 返回图像方式（url 或 base64) ，二选一。当前仅支持 url 方式，base64 方式后期开放。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * 历史遗留字段，无需填写。因为融合只需提取人脸特征，不需要鉴黄。
    */
    @SerializedName("PornDetect")
    @Expose
    private Integer PornDetect;

    /**
    * 0表示不需要鉴政，1表示需要鉴政。默认值为0。
鉴政接口同时会对名人明星进行识别，您可以根据实际需要过滤。
    */
    @SerializedName("CelebrityIdentify")
    @Expose
    private Integer CelebrityIdentify;

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
     * 获取图片 base64 数据。请确保人脸为正脸，无旋转。若某些手机拍摄后人脸被旋转，请使用图片的 EXIF 信息对图片进行旋转处理；请勿在 base64 数据中包含头部，如“data:image/jpeg;base64,”。
     * @return Image 图片 base64 数据。请确保人脸为正脸，无旋转。若某些手机拍摄后人脸被旋转，请使用图片的 EXIF 信息对图片进行旋转处理；请勿在 base64 数据中包含头部，如“data:image/jpeg;base64,”。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * 设置图片 base64 数据。请确保人脸为正脸，无旋转。若某些手机拍摄后人脸被旋转，请使用图片的 EXIF 信息对图片进行旋转处理；请勿在 base64 数据中包含头部，如“data:image/jpeg;base64,”。
     * @param Image 图片 base64 数据。请确保人脸为正脸，无旋转。若某些手机拍摄后人脸被旋转，请使用图片的 EXIF 信息对图片进行旋转处理；请勿在 base64 数据中包含头部，如“data:image/jpeg;base64,”。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 获取返回图像方式（url 或 base64) ，二选一。当前仅支持 url 方式，base64 方式后期开放。
     * @return RspImgType 返回图像方式（url 或 base64) ，二选一。当前仅支持 url 方式，base64 方式后期开放。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * 设置返回图像方式（url 或 base64) ，二选一。当前仅支持 url 方式，base64 方式后期开放。
     * @param RspImgType 返回图像方式（url 或 base64) ，二选一。当前仅支持 url 方式，base64 方式后期开放。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * 获取历史遗留字段，无需填写。因为融合只需提取人脸特征，不需要鉴黄。
     * @return PornDetect 历史遗留字段，无需填写。因为融合只需提取人脸特征，不需要鉴黄。
     */
    public Integer getPornDetect() {
        return this.PornDetect;
    }

    /**
     * 设置历史遗留字段，无需填写。因为融合只需提取人脸特征，不需要鉴黄。
     * @param PornDetect 历史遗留字段，无需填写。因为融合只需提取人脸特征，不需要鉴黄。
     */
    public void setPornDetect(Integer PornDetect) {
        this.PornDetect = PornDetect;
    }

    /**
     * 获取0表示不需要鉴政，1表示需要鉴政。默认值为0。
鉴政接口同时会对名人明星进行识别，您可以根据实际需要过滤。
     * @return CelebrityIdentify 0表示不需要鉴政，1表示需要鉴政。默认值为0。
鉴政接口同时会对名人明星进行识别，您可以根据实际需要过滤。
     */
    public Integer getCelebrityIdentify() {
        return this.CelebrityIdentify;
    }

    /**
     * 设置0表示不需要鉴政，1表示需要鉴政。默认值为0。
鉴政接口同时会对名人明星进行识别，您可以根据实际需要过滤。
     * @param CelebrityIdentify 0表示不需要鉴政，1表示需要鉴政。默认值为0。
鉴政接口同时会对名人明星进行识别，您可以根据实际需要过滤。
     */
    public void setCelebrityIdentify(Integer CelebrityIdentify) {
        this.CelebrityIdentify = CelebrityIdentify;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamSimple(map, prefix + "PornDetect", this.PornDetect);
        this.setParamSimple(map, prefix + "CelebrityIdentify", this.CelebrityIdentify);

    }
}

