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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNameRequest extends AbstractModel{

    /**
    * 需要修改名称的集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要修改的集群名称，可使用中文或英文字符，最大长度32个字符
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 需要修改名称的集群ID 
     * @return ClusterId 需要修改名称的集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 需要修改名称的集群ID
     * @param ClusterId 需要修改名称的集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 需要修改的集群名称，可使用中文或英文字符，最大长度32个字符 
     * @return ClusterName 需要修改的集群名称，可使用中文或英文字符，最大长度32个字符
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 需要修改的集群名称，可使用中文或英文字符，最大长度32个字符
     * @param ClusterName 需要修改的集群名称，可使用中文或英文字符，最大长度32个字符
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

