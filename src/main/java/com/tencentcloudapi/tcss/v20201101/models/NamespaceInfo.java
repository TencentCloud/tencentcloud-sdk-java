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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceInfo extends AbstractModel {

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 包含仓库数
    */
    @SerializedName("RegistryCnt")
    @Expose
    private Long RegistryCnt;

    /**
    * 包含镜像数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 包含风险镜像数
    */
    @SerializedName("RiskImageCnt")
    @Expose
    private Long RiskImageCnt;

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 包含仓库数 
     * @return RegistryCnt 包含仓库数
     */
    public Long getRegistryCnt() {
        return this.RegistryCnt;
    }

    /**
     * Set 包含仓库数
     * @param RegistryCnt 包含仓库数
     */
    public void setRegistryCnt(Long RegistryCnt) {
        this.RegistryCnt = RegistryCnt;
    }

    /**
     * Get 包含镜像数 
     * @return ImageCnt 包含镜像数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 包含镜像数
     * @param ImageCnt 包含镜像数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 包含风险镜像数 
     * @return RiskImageCnt 包含风险镜像数
     */
    public Long getRiskImageCnt() {
        return this.RiskImageCnt;
    }

    /**
     * Set 包含风险镜像数
     * @param RiskImageCnt 包含风险镜像数
     */
    public void setRiskImageCnt(Long RiskImageCnt) {
        this.RiskImageCnt = RiskImageCnt;
    }

    public NamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceInfo(NamespaceInfo source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RegistryCnt != null) {
            this.RegistryCnt = new Long(source.RegistryCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.RiskImageCnt != null) {
            this.RiskImageCnt = new Long(source.RiskImageCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RegistryCnt", this.RegistryCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "RiskImageCnt", this.RiskImageCnt);

    }
}

