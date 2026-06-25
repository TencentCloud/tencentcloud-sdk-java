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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPToolACLListResult extends AbstractModel {

    /**
    * <p>黑白名单鉴权类型</p><p>枚举值：</p><ul><li>None： 不鉴权</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
    */
    @SerializedName("ACLType")
    @Expose
    private String ACLType;

    /**
    * <p>数据列表</p>
    */
    @SerializedName("DataList")
    @Expose
    private AIGWMCPToolACLItem [] DataList;

    /**
    * <p>计数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>黑白名单鉴权类型</p><p>枚举值：</p><ul><li>None： 不鉴权</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul> 
     * @return ACLType <p>黑白名单鉴权类型</p><p>枚举值：</p><ul><li>None： 不鉴权</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public String getACLType() {
        return this.ACLType;
    }

    /**
     * Set <p>黑白名单鉴权类型</p><p>枚举值：</p><ul><li>None： 不鉴权</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     * @param ACLType <p>黑白名单鉴权类型</p><p>枚举值：</p><ul><li>None： 不鉴权</li><li>Allow： 白名单</li><li>Deny： 黑名单</li></ul>
     */
    public void setACLType(String ACLType) {
        this.ACLType = ACLType;
    }

    /**
     * Get <p>数据列表</p> 
     * @return DataList <p>数据列表</p>
     */
    public AIGWMCPToolACLItem [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>数据列表</p>
     * @param DataList <p>数据列表</p>
     */
    public void setDataList(AIGWMCPToolACLItem [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get <p>计数</p> 
     * @return TotalCount <p>计数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>计数</p>
     * @param TotalCount <p>计数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public AIGWMCPToolACLListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPToolACLListResult(AIGWMCPToolACLListResult source) {
        if (source.ACLType != null) {
            this.ACLType = new String(source.ACLType);
        }
        if (source.DataList != null) {
            this.DataList = new AIGWMCPToolACLItem[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new AIGWMCPToolACLItem(source.DataList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ACLType", this.ACLType);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

