/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBClusterDataSourceRequest extends AbstractModel {

    /**
    * 分析集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 只读分析引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源端信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private LibraDBClusterSrcInfo [] SrcInfo;

    /**
     * Get 分析集群ID 
     * @return ClusterId 分析集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群ID
     * @param ClusterId 分析集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 只读分析引擎实例ID 
     * @return InstanceId 只读分析引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只读分析引擎实例ID
     * @param InstanceId 只读分析引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源端信息 
     * @return SrcInfo 源端信息
     */
    public LibraDBClusterSrcInfo [] getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源端信息
     * @param SrcInfo 源端信息
     */
    public void setSrcInfo(LibraDBClusterSrcInfo [] SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    public ModifyLibraDBClusterDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterDataSourceRequest(ModifyLibraDBClusterDataSourceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new LibraDBClusterSrcInfo[source.SrcInfo.length];
            for (int i = 0; i < source.SrcInfo.length; i++) {
                this.SrcInfo[i] = new LibraDBClusterSrcInfo(source.SrcInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "SrcInfo.", this.SrcInfo);

    }
}

