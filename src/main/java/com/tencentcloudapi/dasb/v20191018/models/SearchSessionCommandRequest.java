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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchSessionCommandRequest extends AbstractModel{

    /**
    * 检索的目标命令，为模糊搜索
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 开始时间，不得早于当前时间的180天前
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 默认值为20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Cmd字段前端是否做base64加密
0：否，1：是
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 检索的目标命令，为模糊搜索 
     * @return Cmd 检索的目标命令，为模糊搜索
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 检索的目标命令，为模糊搜索
     * @param Cmd 检索的目标命令，为模糊搜索
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 开始时间，不得早于当前时间的180天前 
     * @return StartTime 开始时间，不得早于当前时间的180天前
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，不得早于当前时间的180天前
     * @param StartTime 开始时间，不得早于当前时间的180天前
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 默认值为20，最大200 
     * @return Limit 默认值为20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认值为20，最大200
     * @param Limit 默认值为20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Cmd字段前端是否做base64加密
0：否，1：是 
     * @return Encoding Cmd字段前端是否做base64加密
0：否，1：是
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Cmd字段前端是否做base64加密
0：否，1：是
     * @param Encoding Cmd字段前端是否做base64加密
0：否，1：是
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public SearchSessionCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchSessionCommandRequest(SearchSessionCommandRequest source) {
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

