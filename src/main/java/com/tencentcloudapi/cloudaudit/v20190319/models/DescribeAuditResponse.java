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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditResponse  extends AbstractModel{

    /**
    * 跟踪集名称。
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * 跟踪集状态，1：开启，0：停止。
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * 队列名称。
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * 队列所在地域。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * cos存储桶名称。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * cos存储桶所在地域。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 是否开启cmq消息通知。1：是，0：否。
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * 日志前缀。
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * 管理事件读写属性，1：只读，2：只写，3：全部
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取跟踪集名称。
     * @return AuditName 跟踪集名称。
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * 设置跟踪集名称。
     * @param AuditName 跟踪集名称。
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * 获取跟踪集状态，1：开启，0：停止。
     * @return AuditStatus 跟踪集状态，1：开启，0：停止。
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * 设置跟踪集状态，1：开启，0：停止。
     * @param AuditStatus 跟踪集状态，1：开启，0：停止。
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * 获取队列名称。
     * @return CmqQueueName 队列名称。
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * 设置队列名称。
     * @param CmqQueueName 队列名称。
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * 获取队列所在地域。
     * @return CmqRegion 队列所在地域。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * 设置队列所在地域。
     * @param CmqRegion 队列所在地域。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * 获取cos存储桶名称。
     * @return CosBucketName cos存储桶名称。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * 设置cos存储桶名称。
     * @param CosBucketName cos存储桶名称。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * 获取cos存储桶所在地域。
     * @return CosRegion cos存储桶所在地域。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * 设置cos存储桶所在地域。
     * @param CosRegion cos存储桶所在地域。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * 获取是否开启cmq消息通知。1：是，0：否。
     * @return IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * 设置是否开启cmq消息通知。1：是，0：否。
     * @param IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * 获取日志前缀。
     * @return LogFilePrefix 日志前缀。
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * 设置日志前缀。
     * @param LogFilePrefix 日志前缀。
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    /**
     * 获取管理事件读写属性，1：只读，2：只写，3：全部
     * @return ReadWriteAttribute 管理事件读写属性，1：只读，2：只写，3：全部
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * 设置管理事件读写属性，1：只读，2：只写，3：全部
     * @param ReadWriteAttribute 管理事件读写属性，1：只读，2：只写，3：全部
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

