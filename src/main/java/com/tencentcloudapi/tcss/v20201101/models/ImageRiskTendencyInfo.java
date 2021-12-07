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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRiskTendencyInfo extends AbstractModel{

    /**
    * 趋势列表
    */
    @SerializedName("ImageRiskSet")
    @Expose
    private RunTimeTendencyInfo [] ImageRiskSet;

    /**
    * 风险类型：
IRT_VULNERABILITY : 安全漏洞
IRT_MALWARE_VIRUS: 木马病毒
IRT_RISK:敏感信息
    */
    @SerializedName("ImageRiskType")
    @Expose
    private String ImageRiskType;

    /**
     * Get 趋势列表 
     * @return ImageRiskSet 趋势列表
     */
    public RunTimeTendencyInfo [] getImageRiskSet() {
        return this.ImageRiskSet;
    }

    /**
     * Set 趋势列表
     * @param ImageRiskSet 趋势列表
     */
    public void setImageRiskSet(RunTimeTendencyInfo [] ImageRiskSet) {
        this.ImageRiskSet = ImageRiskSet;
    }

    /**
     * Get 风险类型：
IRT_VULNERABILITY : 安全漏洞
IRT_MALWARE_VIRUS: 木马病毒
IRT_RISK:敏感信息 
     * @return ImageRiskType 风险类型：
IRT_VULNERABILITY : 安全漏洞
IRT_MALWARE_VIRUS: 木马病毒
IRT_RISK:敏感信息
     */
    public String getImageRiskType() {
        return this.ImageRiskType;
    }

    /**
     * Set 风险类型：
IRT_VULNERABILITY : 安全漏洞
IRT_MALWARE_VIRUS: 木马病毒
IRT_RISK:敏感信息
     * @param ImageRiskType 风险类型：
IRT_VULNERABILITY : 安全漏洞
IRT_MALWARE_VIRUS: 木马病毒
IRT_RISK:敏感信息
     */
    public void setImageRiskType(String ImageRiskType) {
        this.ImageRiskType = ImageRiskType;
    }

    public ImageRiskTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRiskTendencyInfo(ImageRiskTendencyInfo source) {
        if (source.ImageRiskSet != null) {
            this.ImageRiskSet = new RunTimeTendencyInfo[source.ImageRiskSet.length];
            for (int i = 0; i < source.ImageRiskSet.length; i++) {
                this.ImageRiskSet[i] = new RunTimeTendencyInfo(source.ImageRiskSet[i]);
            }
        }
        if (source.ImageRiskType != null) {
            this.ImageRiskType = new String(source.ImageRiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageRiskSet.", this.ImageRiskSet);
        this.setParamSimple(map, prefix + "ImageRiskType", this.ImageRiskType);

    }
}

