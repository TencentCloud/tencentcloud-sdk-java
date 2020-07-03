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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigResponse extends AbstractModel{

    /**
    * 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示。
    */
    @SerializedName("NoticeLevel")
    @Expose
    private String NoticeLevel;

    /**
    * 配置ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 记录创建时间。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 记录更新新建。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 内容检测通知等级-1:通知,0-不通知
    */
    @SerializedName("ContentLevel")
    @Expose
    private Long ContentLevel;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示。 
     * @return NoticeLevel 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示。
     */
    public String getNoticeLevel() {
        return this.NoticeLevel;
    }

    /**
     * Set 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示。
     * @param NoticeLevel 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示。
     */
    public void setNoticeLevel(String NoticeLevel) {
        this.NoticeLevel = NoticeLevel;
    }

    /**
     * Get 配置ID。 
     * @return Id 配置ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置ID。
     * @param Id 配置ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 记录创建时间。 
     * @return CreatedAt 记录创建时间。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 记录创建时间。
     * @param CreatedAt 记录创建时间。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 记录更新新建。 
     * @return UpdatedAt 记录更新新建。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 记录更新新建。
     * @param UpdatedAt 记录更新新建。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 云用户appid。 
     * @return Appid 云用户appid。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 内容检测通知等级-1:通知,0-不通知 
     * @return ContentLevel 内容检测通知等级-1:通知,0-不通知
     */
    public Long getContentLevel() {
        return this.ContentLevel;
    }

    /**
     * Set 内容检测通知等级-1:通知,0-不通知
     * @param ContentLevel 内容检测通知等级-1:通知,0-不通知
     */
    public void setContentLevel(Long ContentLevel) {
        this.ContentLevel = ContentLevel;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeLevel", this.NoticeLevel);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ContentLevel", this.ContentLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

