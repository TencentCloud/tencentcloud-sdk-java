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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealtimeScanConfigResponse extends AbstractModel{

    /**
    * 返回结果码，0正常，非0失败
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 送检类型，0: 全量送审，1: 自定义送审
    */
    @SerializedName("AuditType")
    @Expose
    private Long AuditType;

    /**
    * 用户号正则表达式
    */
    @SerializedName("UserIdRegex")
    @Expose
    private String [] UserIdRegex;

    /**
    * 房间号正则表达式
    */
    @SerializedName("RoomIdRegex")
    @Expose
    private String [] RoomIdRegex;

    /**
    * 用户号字符串，逗号分隔，示例："0001,0002,0003"
    */
    @SerializedName("UserIdString")
    @Expose
    private String UserIdString;

    /**
    * 房间号字符串，逗号分隔，示例："0001,0002,0003"
    */
    @SerializedName("RoomIdString")
    @Expose
    private String RoomIdString;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回结果码，0正常，非0失败 
     * @return ErrorCode 返回结果码，0正常，非0失败
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 返回结果码，0正常，非0失败
     * @param ErrorCode 返回结果码，0正常，非0失败
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 送检类型，0: 全量送审，1: 自定义送审 
     * @return AuditType 送检类型，0: 全量送审，1: 自定义送审
     */
    public Long getAuditType() {
        return this.AuditType;
    }

    /**
     * Set 送检类型，0: 全量送审，1: 自定义送审
     * @param AuditType 送检类型，0: 全量送审，1: 自定义送审
     */
    public void setAuditType(Long AuditType) {
        this.AuditType = AuditType;
    }

    /**
     * Get 用户号正则表达式 
     * @return UserIdRegex 用户号正则表达式
     */
    public String [] getUserIdRegex() {
        return this.UserIdRegex;
    }

    /**
     * Set 用户号正则表达式
     * @param UserIdRegex 用户号正则表达式
     */
    public void setUserIdRegex(String [] UserIdRegex) {
        this.UserIdRegex = UserIdRegex;
    }

    /**
     * Get 房间号正则表达式 
     * @return RoomIdRegex 房间号正则表达式
     */
    public String [] getRoomIdRegex() {
        return this.RoomIdRegex;
    }

    /**
     * Set 房间号正则表达式
     * @param RoomIdRegex 房间号正则表达式
     */
    public void setRoomIdRegex(String [] RoomIdRegex) {
        this.RoomIdRegex = RoomIdRegex;
    }

    /**
     * Get 用户号字符串，逗号分隔，示例："0001,0002,0003" 
     * @return UserIdString 用户号字符串，逗号分隔，示例："0001,0002,0003"
     */
    public String getUserIdString() {
        return this.UserIdString;
    }

    /**
     * Set 用户号字符串，逗号分隔，示例："0001,0002,0003"
     * @param UserIdString 用户号字符串，逗号分隔，示例："0001,0002,0003"
     */
    public void setUserIdString(String UserIdString) {
        this.UserIdString = UserIdString;
    }

    /**
     * Get 房间号字符串，逗号分隔，示例："0001,0002,0003" 
     * @return RoomIdString 房间号字符串，逗号分隔，示例："0001,0002,0003"
     */
    public String getRoomIdString() {
        return this.RoomIdString;
    }

    /**
     * Set 房间号字符串，逗号分隔，示例："0001,0002,0003"
     * @param RoomIdString 房间号字符串，逗号分隔，示例："0001,0002,0003"
     */
    public void setRoomIdString(String RoomIdString) {
        this.RoomIdString = RoomIdString;
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

    public DescribeRealtimeScanConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealtimeScanConfigResponse(DescribeRealtimeScanConfigResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.AuditType != null) {
            this.AuditType = new Long(source.AuditType);
        }
        if (source.UserIdRegex != null) {
            this.UserIdRegex = new String[source.UserIdRegex.length];
            for (int i = 0; i < source.UserIdRegex.length; i++) {
                this.UserIdRegex[i] = new String(source.UserIdRegex[i]);
            }
        }
        if (source.RoomIdRegex != null) {
            this.RoomIdRegex = new String[source.RoomIdRegex.length];
            for (int i = 0; i < source.RoomIdRegex.length; i++) {
                this.RoomIdRegex[i] = new String(source.RoomIdRegex[i]);
            }
        }
        if (source.UserIdString != null) {
            this.UserIdString = new String(source.UserIdString);
        }
        if (source.RoomIdString != null) {
            this.RoomIdString = new String(source.RoomIdString);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);
        this.setParamArraySimple(map, prefix + "UserIdRegex.", this.UserIdRegex);
        this.setParamArraySimple(map, prefix + "RoomIdRegex.", this.RoomIdRegex);
        this.setParamSimple(map, prefix + "UserIdString", this.UserIdString);
        this.setParamSimple(map, prefix + "RoomIdString", this.RoomIdString);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

