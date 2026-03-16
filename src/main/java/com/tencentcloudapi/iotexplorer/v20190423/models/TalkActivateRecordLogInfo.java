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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkActivateRecordLogInfo extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 激活时间，秒级时间戳
    */
    @SerializedName("ActiveTime")
    @Expose
    private Long ActiveTime;

    /**
    * 过期时间，秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * TWeTalk类型：1-基础版；2-高级版；3-多模态；
    */
    @SerializedName("ServiceType")
    @Expose
    private Long ServiceType;

    /**
    * 状态: 0-未激活, 1-已激活, 2-已过期, 3-已作废
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 激活时间，秒级时间戳 
     * @return ActiveTime 激活时间，秒级时间戳
     */
    public Long getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间，秒级时间戳
     * @param ActiveTime 激活时间，秒级时间戳
     */
    public void setActiveTime(Long ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 过期时间，秒级时间戳 
     * @return ExpireTime 过期时间，秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，秒级时间戳
     * @param ExpireTime 过期时间，秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get TWeTalk类型：1-基础版；2-高级版；3-多模态； 
     * @return ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public Long getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set TWeTalk类型：1-基础版；2-高级版；3-多模态；
     * @param ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public void setServiceType(Long ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 状态: 0-未激活, 1-已激活, 2-已过期, 3-已作废 
     * @return Status 状态: 0-未激活, 1-已激活, 2-已过期, 3-已作废
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态: 0-未激活, 1-已激活, 2-已过期, 3-已作废
     * @param Status 状态: 0-未激活, 1-已激活, 2-已过期, 3-已作废
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息 
     * @return ErrorMsg 错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
     * @param ErrorMsg 错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public TalkActivateRecordLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkActivateRecordLogInfo(TalkActivateRecordLogInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new Long(source.ActiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new Long(source.ServiceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

