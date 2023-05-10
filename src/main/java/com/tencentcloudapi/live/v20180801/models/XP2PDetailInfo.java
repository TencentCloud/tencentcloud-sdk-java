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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XP2PDetailInfo extends AbstractModel{

    /**
    * CDN流量。
    */
    @SerializedName("CdnBytes")
    @Expose
    private Long CdnBytes;

    /**
    * P2P流量。
    */
    @SerializedName("P2pBytes")
    @Expose
    private Long P2pBytes;

    /**
    * 卡播人数。
    */
    @SerializedName("StuckPeople")
    @Expose
    private Long StuckPeople;

    /**
    * 卡播次数。
    */
    @SerializedName("StuckTimes")
    @Expose
    private Long StuckTimes;

    /**
    * 在线人数。
    */
    @SerializedName("OnlinePeople")
    @Expose
    private Long OnlinePeople;

    /**
    * 起播请求次数
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * 起播成功次数
    */
    @SerializedName("RequestSuccess")
    @Expose
    private Long RequestSuccess;

    /**
    * 时间，一分钟粒度，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 类型，分live和vod两种。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 流ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * AppId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get CDN流量。 
     * @return CdnBytes CDN流量。
     */
    public Long getCdnBytes() {
        return this.CdnBytes;
    }

    /**
     * Set CDN流量。
     * @param CdnBytes CDN流量。
     */
    public void setCdnBytes(Long CdnBytes) {
        this.CdnBytes = CdnBytes;
    }

    /**
     * Get P2P流量。 
     * @return P2pBytes P2P流量。
     */
    public Long getP2pBytes() {
        return this.P2pBytes;
    }

    /**
     * Set P2P流量。
     * @param P2pBytes P2P流量。
     */
    public void setP2pBytes(Long P2pBytes) {
        this.P2pBytes = P2pBytes;
    }

    /**
     * Get 卡播人数。 
     * @return StuckPeople 卡播人数。
     */
    public Long getStuckPeople() {
        return this.StuckPeople;
    }

    /**
     * Set 卡播人数。
     * @param StuckPeople 卡播人数。
     */
    public void setStuckPeople(Long StuckPeople) {
        this.StuckPeople = StuckPeople;
    }

    /**
     * Get 卡播次数。 
     * @return StuckTimes 卡播次数。
     */
    public Long getStuckTimes() {
        return this.StuckTimes;
    }

    /**
     * Set 卡播次数。
     * @param StuckTimes 卡播次数。
     */
    public void setStuckTimes(Long StuckTimes) {
        this.StuckTimes = StuckTimes;
    }

    /**
     * Get 在线人数。 
     * @return OnlinePeople 在线人数。
     */
    public Long getOnlinePeople() {
        return this.OnlinePeople;
    }

    /**
     * Set 在线人数。
     * @param OnlinePeople 在线人数。
     */
    public void setOnlinePeople(Long OnlinePeople) {
        this.OnlinePeople = OnlinePeople;
    }

    /**
     * Get 起播请求次数 
     * @return Request 起播请求次数
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 起播请求次数
     * @param Request 起播请求次数
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get 起播成功次数 
     * @return RequestSuccess 起播成功次数
     */
    public Long getRequestSuccess() {
        return this.RequestSuccess;
    }

    /**
     * Set 起播成功次数
     * @param RequestSuccess 起播成功次数
     */
    public void setRequestSuccess(Long RequestSuccess) {
        this.RequestSuccess = RequestSuccess;
    }

    /**
     * Get 时间，一分钟粒度，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。。 
     * @return Time 时间，一分钟粒度，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间，一分钟粒度，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。。
     * @param Time 时间，一分钟粒度，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 类型，分live和vod两种。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型，分live和vod两种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，分live和vod两种。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型，分live和vod两种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 流ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamName 流ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamName 流ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get AppId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId AppId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId AppId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public XP2PDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XP2PDetailInfo(XP2PDetailInfo source) {
        if (source.CdnBytes != null) {
            this.CdnBytes = new Long(source.CdnBytes);
        }
        if (source.P2pBytes != null) {
            this.P2pBytes = new Long(source.P2pBytes);
        }
        if (source.StuckPeople != null) {
            this.StuckPeople = new Long(source.StuckPeople);
        }
        if (source.StuckTimes != null) {
            this.StuckTimes = new Long(source.StuckTimes);
        }
        if (source.OnlinePeople != null) {
            this.OnlinePeople = new Long(source.OnlinePeople);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
        if (source.RequestSuccess != null) {
            this.RequestSuccess = new Long(source.RequestSuccess);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CdnBytes", this.CdnBytes);
        this.setParamSimple(map, prefix + "P2pBytes", this.P2pBytes);
        this.setParamSimple(map, prefix + "StuckPeople", this.StuckPeople);
        this.setParamSimple(map, prefix + "StuckTimes", this.StuckTimes);
        this.setParamSimple(map, prefix + "OnlinePeople", this.OnlinePeople);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "RequestSuccess", this.RequestSuccess);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

