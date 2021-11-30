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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageToObjectRequest extends AbstractModel{

    /**
    * 图片列表，允许传入多张图片，目前只支持传入图片base64编码，图片url暂不支持
    */
    @SerializedName("ImageInfoList")
    @Expose
    private ImageInfo [] ImageInfoList;

    /**
    * 图片处理参数
    */
    @SerializedName("HandleParam")
    @Expose
    private HandleParam HandleParam;

    /**
    * 报告类型，目前支持11（检验报告），12（检查报告），15（病理报告），28（出院报告），29（入院报告），210（门诊病历），212（手术记录），218（诊断证明），363（心电图），27（内窥镜检查），215（处方单），219（免疫接种证明），301（C14呼气试验）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为 False，则 Type 字段不能为 0，否则无法输出结果。
注意：当 IsUsedClassify 为True 时，表示使用收费的报告分类服务，将会产生额外的费用，具体收费标准参见 [购买指南的产品价格](https://cloud.tencent.com/document/product/1314/54264)。
    */
    @SerializedName("IsUsedClassify")
    @Expose
    private Boolean IsUsedClassify;

    /**
     * Get 图片列表，允许传入多张图片，目前只支持传入图片base64编码，图片url暂不支持 
     * @return ImageInfoList 图片列表，允许传入多张图片，目前只支持传入图片base64编码，图片url暂不支持
     */
    public ImageInfo [] getImageInfoList() {
        return this.ImageInfoList;
    }

    /**
     * Set 图片列表，允许传入多张图片，目前只支持传入图片base64编码，图片url暂不支持
     * @param ImageInfoList 图片列表，允许传入多张图片，目前只支持传入图片base64编码，图片url暂不支持
     */
    public void setImageInfoList(ImageInfo [] ImageInfoList) {
        this.ImageInfoList = ImageInfoList;
    }

    /**
     * Get 图片处理参数 
     * @return HandleParam 图片处理参数
     */
    public HandleParam getHandleParam() {
        return this.HandleParam;
    }

    /**
     * Set 图片处理参数
     * @param HandleParam 图片处理参数
     */
    public void setHandleParam(HandleParam HandleParam) {
        this.HandleParam = HandleParam;
    }

    /**
     * Get 报告类型，目前支持11（检验报告），12（检查报告），15（病理报告），28（出院报告），29（入院报告），210（门诊病历），212（手术记录），218（诊断证明），363（心电图），27（内窥镜检查），215（处方单），219（免疫接种证明），301（C14呼气试验）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果） 
     * @return Type 报告类型，目前支持11（检验报告），12（检查报告），15（病理报告），28（出院报告），29（入院报告），210（门诊病历），212（手术记录），218（诊断证明），363（心电图），27（内窥镜检查），215（处方单），219（免疫接种证明），301（C14呼气试验）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 报告类型，目前支持11（检验报告），12（检查报告），15（病理报告），28（出院报告），29（入院报告），210（门诊病历），212（手术记录），218（诊断证明），363（心电图），27（内窥镜检查），215（处方单），219（免疫接种证明），301（C14呼气试验）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     * @param Type 报告类型，目前支持11（检验报告），12（检查报告），15（病理报告），28（出院报告），29（入院报告），210（门诊病历），212（手术记录），218（诊断证明），363（心电图），27（内窥镜检查），215（处方单），219（免疫接种证明），301（C14呼气试验）。如果不清楚报告类型，可以使用分类引擎，该字段传0（同时IsUsedClassify字段必须为True，否则无法输出结果）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为 False，则 Type 字段不能为 0，否则无法输出结果。
注意：当 IsUsedClassify 为True 时，表示使用收费的报告分类服务，将会产生额外的费用，具体收费标准参见 [购买指南的产品价格](https://cloud.tencent.com/document/product/1314/54264)。 
     * @return IsUsedClassify 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为 False，则 Type 字段不能为 0，否则无法输出结果。
注意：当 IsUsedClassify 为True 时，表示使用收费的报告分类服务，将会产生额外的费用，具体收费标准参见 [购买指南的产品价格](https://cloud.tencent.com/document/product/1314/54264)。
     */
    public Boolean getIsUsedClassify() {
        return this.IsUsedClassify;
    }

    /**
     * Set 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为 False，则 Type 字段不能为 0，否则无法输出结果。
注意：当 IsUsedClassify 为True 时，表示使用收费的报告分类服务，将会产生额外的费用，具体收费标准参见 [购买指南的产品价格](https://cloud.tencent.com/document/product/1314/54264)。
     * @param IsUsedClassify 是否使用分类引擎，当不确定报告类型时，可以使用收费的报告分类引擎服务。若该字段为 False，则 Type 字段不能为 0，否则无法输出结果。
注意：当 IsUsedClassify 为True 时，表示使用收费的报告分类服务，将会产生额外的费用，具体收费标准参见 [购买指南的产品价格](https://cloud.tencent.com/document/product/1314/54264)。
     */
    public void setIsUsedClassify(Boolean IsUsedClassify) {
        this.IsUsedClassify = IsUsedClassify;
    }

    public ImageToObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageToObjectRequest(ImageToObjectRequest source) {
        if (source.ImageInfoList != null) {
            this.ImageInfoList = new ImageInfo[source.ImageInfoList.length];
            for (int i = 0; i < source.ImageInfoList.length; i++) {
                this.ImageInfoList[i] = new ImageInfo(source.ImageInfoList[i]);
            }
        }
        if (source.HandleParam != null) {
            this.HandleParam = new HandleParam(source.HandleParam);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsUsedClassify != null) {
            this.IsUsedClassify = new Boolean(source.IsUsedClassify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfoList.", this.ImageInfoList);
        this.setParamObj(map, prefix + "HandleParam.", this.HandleParam);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsUsedClassify", this.IsUsedClassify);

    }
}

