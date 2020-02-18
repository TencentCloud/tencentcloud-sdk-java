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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulInfo extends AbstractModel{

    /**
    * 漏洞列表
    */
    @SerializedName("VulList")
    @Expose
    private VulList [] VulList;

    /**
    * 漏洞文件评分
    */
    @SerializedName("VulFileScore")
    @Expose
    private Long VulFileScore;

    /**
     * Get 漏洞列表 
     * @return VulList 漏洞列表
     */
    public VulList [] getVulList() {
        return this.VulList;
    }

    /**
     * Set 漏洞列表
     * @param VulList 漏洞列表
     */
    public void setVulList(VulList [] VulList) {
        this.VulList = VulList;
    }

    /**
     * Get 漏洞文件评分 
     * @return VulFileScore 漏洞文件评分
     */
    public Long getVulFileScore() {
        return this.VulFileScore;
    }

    /**
     * Set 漏洞文件评分
     * @param VulFileScore 漏洞文件评分
     */
    public void setVulFileScore(Long VulFileScore) {
        this.VulFileScore = VulFileScore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulList.", this.VulList);
        this.setParamSimple(map, prefix + "VulFileScore", this.VulFileScore);

    }
}

