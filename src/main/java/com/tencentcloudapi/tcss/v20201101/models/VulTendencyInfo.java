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

public class VulTendencyInfo extends AbstractModel{

    /**
    * 漏洞趋势列表
    */
    @SerializedName("VulSet")
    @Expose
    private RunTimeTendencyInfo [] VulSet;

    /**
    * 漏洞影响的镜像类型：
LOCAL：本地镜像
REGISTRY: 仓库镜像
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get 漏洞趋势列表 
     * @return VulSet 漏洞趋势列表
     */
    public RunTimeTendencyInfo [] getVulSet() {
        return this.VulSet;
    }

    /**
     * Set 漏洞趋势列表
     * @param VulSet 漏洞趋势列表
     */
    public void setVulSet(RunTimeTendencyInfo [] VulSet) {
        this.VulSet = VulSet;
    }

    /**
     * Get 漏洞影响的镜像类型：
LOCAL：本地镜像
REGISTRY: 仓库镜像 
     * @return ImageType 漏洞影响的镜像类型：
LOCAL：本地镜像
REGISTRY: 仓库镜像
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 漏洞影响的镜像类型：
LOCAL：本地镜像
REGISTRY: 仓库镜像
     * @param ImageType 漏洞影响的镜像类型：
LOCAL：本地镜像
REGISTRY: 仓库镜像
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public VulTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTendencyInfo(VulTendencyInfo source) {
        if (source.VulSet != null) {
            this.VulSet = new RunTimeTendencyInfo[source.VulSet.length];
            for (int i = 0; i < source.VulSet.length; i++) {
                this.VulSet[i] = new RunTimeTendencyInfo(source.VulSet[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulSet.", this.VulSet);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

