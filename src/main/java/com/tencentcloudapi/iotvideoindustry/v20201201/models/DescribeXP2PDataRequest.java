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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeXP2PDataRequest extends AbstractModel{

    /**
    * P2P应用ID
    */
    @SerializedName("P2PAppId")
    @Expose
    private String P2PAppId;

    /**
    * 查询开始时间，时间戳秒
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 查询结束时间，时间戳秒
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * P2P通路ID
    */
    @SerializedName("P2PChannelId")
    @Expose
    private String P2PChannelId;

    /**
     * Get P2P应用ID 
     * @return P2PAppId P2P应用ID
     */
    public String getP2PAppId() {
        return this.P2PAppId;
    }

    /**
     * Set P2P应用ID
     * @param P2PAppId P2P应用ID
     */
    public void setP2PAppId(String P2PAppId) {
        this.P2PAppId = P2PAppId;
    }

    /**
     * Get 查询开始时间，时间戳秒 
     * @return From 查询开始时间，时间戳秒
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 查询开始时间，时间戳秒
     * @param From 查询开始时间，时间戳秒
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 查询结束时间，时间戳秒 
     * @return To 查询结束时间，时间戳秒
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 查询结束时间，时间戳秒
     * @param To 查询结束时间，时间戳秒
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get P2P通路ID 
     * @return P2PChannelId P2P通路ID
     */
    public String getP2PChannelId() {
        return this.P2PChannelId;
    }

    /**
     * Set P2P通路ID
     * @param P2PChannelId P2P通路ID
     */
    public void setP2PChannelId(String P2PChannelId) {
        this.P2PChannelId = P2PChannelId;
    }

    public DescribeXP2PDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeXP2PDataRequest(DescribeXP2PDataRequest source) {
        if (source.P2PAppId != null) {
            this.P2PAppId = new String(source.P2PAppId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.P2PChannelId != null) {
            this.P2PChannelId = new String(source.P2PChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "P2PAppId", this.P2PAppId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "P2PChannelId", this.P2PChannelId);

    }
}

