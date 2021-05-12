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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigRequest extends AbstractModel{

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 摄像头签名
    */
    @SerializedName("CameraSign")
    @Expose
    private String CameraSign;

    /**
    * 摄像头app id
    */
    @SerializedName("CameraAppId")
    @Expose
    private String CameraAppId;

    /**
    * 摄像头时间戳，毫秒
    */
    @SerializedName("CameraTimestamp")
    @Expose
    private Long CameraTimestamp;

    /**
    * MAC地址，字母大写
    */
    @SerializedName("ServerMac")
    @Expose
    private String ServerMac;

    /**
    * 集团编码
    */
    @SerializedName("GroupCode")
    @Expose
    private String GroupCode;

    /**
    * 广场ID
    */
    @SerializedName("MallId")
    @Expose
    private Long MallId;

    /**
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 摄像头签名 
     * @return CameraSign 摄像头签名
     */
    public String getCameraSign() {
        return this.CameraSign;
    }

    /**
     * Set 摄像头签名
     * @param CameraSign 摄像头签名
     */
    public void setCameraSign(String CameraSign) {
        this.CameraSign = CameraSign;
    }

    /**
     * Get 摄像头app id 
     * @return CameraAppId 摄像头app id
     */
    public String getCameraAppId() {
        return this.CameraAppId;
    }

    /**
     * Set 摄像头app id
     * @param CameraAppId 摄像头app id
     */
    public void setCameraAppId(String CameraAppId) {
        this.CameraAppId = CameraAppId;
    }

    /**
     * Get 摄像头时间戳，毫秒 
     * @return CameraTimestamp 摄像头时间戳，毫秒
     */
    public Long getCameraTimestamp() {
        return this.CameraTimestamp;
    }

    /**
     * Set 摄像头时间戳，毫秒
     * @param CameraTimestamp 摄像头时间戳，毫秒
     */
    public void setCameraTimestamp(Long CameraTimestamp) {
        this.CameraTimestamp = CameraTimestamp;
    }

    /**
     * Get MAC地址，字母大写 
     * @return ServerMac MAC地址，字母大写
     */
    public String getServerMac() {
        return this.ServerMac;
    }

    /**
     * Set MAC地址，字母大写
     * @param ServerMac MAC地址，字母大写
     */
    public void setServerMac(String ServerMac) {
        this.ServerMac = ServerMac;
    }

    /**
     * Get 集团编码 
     * @return GroupCode 集团编码
     */
    public String getGroupCode() {
        return this.GroupCode;
    }

    /**
     * Set 集团编码
     * @param GroupCode 集团编码
     */
    public void setGroupCode(String GroupCode) {
        this.GroupCode = GroupCode;
    }

    /**
     * Get 广场ID 
     * @return MallId 广场ID
     */
    public Long getMallId() {
        return this.MallId;
    }

    /**
     * Set 广场ID
     * @param MallId 广场ID
     */
    public void setMallId(Long MallId) {
        this.MallId = MallId;
    }

    public DescribeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigRequest(DescribeConfigRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.CameraSign != null) {
            this.CameraSign = new String(source.CameraSign);
        }
        if (source.CameraAppId != null) {
            this.CameraAppId = new String(source.CameraAppId);
        }
        if (source.CameraTimestamp != null) {
            this.CameraTimestamp = new Long(source.CameraTimestamp);
        }
        if (source.ServerMac != null) {
            this.ServerMac = new String(source.ServerMac);
        }
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "CameraSign", this.CameraSign);
        this.setParamSimple(map, prefix + "CameraAppId", this.CameraAppId);
        this.setParamSimple(map, prefix + "CameraTimestamp", this.CameraTimestamp);
        this.setParamSimple(map, prefix + "ServerMac", this.ServerMac);
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamSimple(map, prefix + "MallId", this.MallId);

    }
}

