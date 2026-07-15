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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetMainEditVersionRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>课堂ID</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>版本号，可通过DescribeEditVersion接口获取当前课堂全部版本，来查看到版本号。</p>
    */
    @SerializedName("VersionNo")
    @Expose
    private Long VersionNo;

    /**
    * <p>操作者ID</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>应用ID</p> 
     * @return SdkAppId <p>应用ID</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param SdkAppId <p>应用ID</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>课堂ID</p> 
     * @return RoomId <p>课堂ID</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>课堂ID</p>
     * @param RoomId <p>课堂ID</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>版本号，可通过DescribeEditVersion接口获取当前课堂全部版本，来查看到版本号。</p> 
     * @return VersionNo <p>版本号，可通过DescribeEditVersion接口获取当前课堂全部版本，来查看到版本号。</p>
     */
    public Long getVersionNo() {
        return this.VersionNo;
    }

    /**
     * Set <p>版本号，可通过DescribeEditVersion接口获取当前课堂全部版本，来查看到版本号。</p>
     * @param VersionNo <p>版本号，可通过DescribeEditVersion接口获取当前课堂全部版本，来查看到版本号。</p>
     */
    public void setVersionNo(Long VersionNo) {
        this.VersionNo = VersionNo;
    }

    /**
     * Get <p>操作者ID</p> 
     * @return Operator <p>操作者ID</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者ID</p>
     * @param Operator <p>操作者ID</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public SetMainEditVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetMainEditVersionRequest(SetMainEditVersionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.VersionNo != null) {
            this.VersionNo = new Long(source.VersionNo);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "VersionNo", this.VersionNo);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

