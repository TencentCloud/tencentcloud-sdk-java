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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchAttackLogResponse extends AbstractModel{

    /**
    * 当前返回的攻击日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 接口升级，此字段无效，默认返回空字符串
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 攻击日志数组条目内容
    */
    @SerializedName("Data")
    @Expose
    private AttackLogInfo [] Data;

    /**
    * CLS接口返回内容
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * CLS接口返回内容，标志是否启动新版本索引
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前返回的攻击日志条数 
     * @return Count 当前返回的攻击日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 当前返回的攻击日志条数
     * @param Count 当前返回的攻击日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 接口升级，此字段无效，默认返回空字符串 
     * @return Context 接口升级，此字段无效，默认返回空字符串
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 接口升级，此字段无效，默认返回空字符串
     * @param Context 接口升级，此字段无效，默认返回空字符串
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 攻击日志数组条目内容 
     * @return Data 攻击日志数组条目内容
     */
    public AttackLogInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 攻击日志数组条目内容
     * @param Data 攻击日志数组条目内容
     */
    public void setData(AttackLogInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get CLS接口返回内容 
     * @return ListOver CLS接口返回内容
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set CLS接口返回内容
     * @param ListOver CLS接口返回内容
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get CLS接口返回内容，标志是否启动新版本索引 
     * @return SqlFlag CLS接口返回内容，标志是否启动新版本索引
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set CLS接口返回内容，标志是否启动新版本索引
     * @param SqlFlag CLS接口返回内容，标志是否启动新版本索引
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchAttackLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAttackLogResponse(SearchAttackLogResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Data != null) {
            this.Data = new AttackLogInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AttackLogInfo(source.Data[i]);
            }
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

