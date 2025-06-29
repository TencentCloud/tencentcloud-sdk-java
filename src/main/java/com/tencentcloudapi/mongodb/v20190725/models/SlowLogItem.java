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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogItem extends AbstractModel {

    /**
    * 慢日志
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * queryHash
    */
    @SerializedName("QueryHash")
    @Expose
    private String QueryHash;

    /**
     * Get 慢日志 
     * @return Log 慢日志
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 慢日志
     * @param Log 慢日志
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get queryHash 
     * @return QueryHash queryHash
     */
    public String getQueryHash() {
        return this.QueryHash;
    }

    /**
     * Set queryHash
     * @param QueryHash queryHash
     */
    public void setQueryHash(String QueryHash) {
        this.QueryHash = QueryHash;
    }

    public SlowLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogItem(SlowLogItem source) {
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.QueryHash != null) {
            this.QueryHash = new String(source.QueryHash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "QueryHash", this.QueryHash);

    }
}

