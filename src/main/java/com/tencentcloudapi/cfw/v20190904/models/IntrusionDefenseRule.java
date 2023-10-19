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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntrusionDefenseRule extends AbstractModel {

    /**
    * 规则方向，0出站，1入站，3内网间
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 规则结束时间，格式：2006-01-02 15:04:05，必须大于当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 规则IP地址，IP与Domain必填其中之一
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 规则域名，IP与Domain必填其中之一
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 备注信息，长度不能超过50
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 规则开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 规则方向，0出站，1入站，3内网间 
     * @return Direction 规则方向，0出站，1入站，3内网间
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向，0出站，1入站，3内网间
     * @param Direction 规则方向，0出站，1入站，3内网间
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则结束时间，格式：2006-01-02 15:04:05，必须大于当前时间 
     * @return EndTime 规则结束时间，格式：2006-01-02 15:04:05，必须大于当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则结束时间，格式：2006-01-02 15:04:05，必须大于当前时间
     * @param EndTime 规则结束时间，格式：2006-01-02 15:04:05，必须大于当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 规则IP地址，IP与Domain必填其中之一 
     * @return IP 规则IP地址，IP与Domain必填其中之一
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 规则IP地址，IP与Domain必填其中之一
     * @param IP 规则IP地址，IP与Domain必填其中之一
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 规则域名，IP与Domain必填其中之一 
     * @return Domain 规则域名，IP与Domain必填其中之一
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 规则域名，IP与Domain必填其中之一
     * @param Domain 规则域名，IP与Domain必填其中之一
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 备注信息，长度不能超过50 
     * @return Comment 备注信息，长度不能超过50
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注信息，长度不能超过50
     * @param Comment 备注信息，长度不能超过50
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 规则开始时间 
     * @return StartTime 规则开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 规则开始时间
     * @param StartTime 规则开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public IntrusionDefenseRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntrusionDefenseRule(IntrusionDefenseRule source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

