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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDLPFileDetectTaskRequest extends AbstractModel {

    /**
    * 文件下载Url
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件Md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 负载类型  1 从GroupId中选一节点 鉴定  2使用所有SelectNodeIds节点鉴定
    */
    @SerializedName("BalanceType")
    @Expose
    private Long BalanceType;

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 选中节点唯一Id列表,BalanceType=2时必填
    */
    @SerializedName("SelectNodeIds")
    @Expose
    private String [] SelectNodeIds;

    /**
    * 节点组唯一Id,BalanceType=1时必填
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 文件下载Url 
     * @return DownloadUrl 文件下载Url
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 文件下载Url
     * @param DownloadUrl 文件下载Url
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件Md5 
     * @return FileMd5 文件Md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件Md5
     * @param FileMd5 文件Md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 负载类型  1 从GroupId中选一节点 鉴定  2使用所有SelectNodeIds节点鉴定 
     * @return BalanceType 负载类型  1 从GroupId中选一节点 鉴定  2使用所有SelectNodeIds节点鉴定
     */
    public Long getBalanceType() {
        return this.BalanceType;
    }

    /**
     * Set 负载类型  1 从GroupId中选一节点 鉴定  2使用所有SelectNodeIds节点鉴定
     * @param BalanceType 负载类型  1 从GroupId中选一节点 鉴定  2使用所有SelectNodeIds节点鉴定
     */
    public void setBalanceType(Long BalanceType) {
        this.BalanceType = BalanceType;
    }

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get 选中节点唯一Id列表,BalanceType=2时必填 
     * @return SelectNodeIds 选中节点唯一Id列表,BalanceType=2时必填
     */
    public String [] getSelectNodeIds() {
        return this.SelectNodeIds;
    }

    /**
     * Set 选中节点唯一Id列表,BalanceType=2时必填
     * @param SelectNodeIds 选中节点唯一Id列表,BalanceType=2时必填
     */
    public void setSelectNodeIds(String [] SelectNodeIds) {
        this.SelectNodeIds = SelectNodeIds;
    }

    /**
     * Get 节点组唯一Id,BalanceType=1时必填 
     * @return GroupId 节点组唯一Id,BalanceType=1时必填
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 节点组唯一Id,BalanceType=1时必填
     * @param GroupId 节点组唯一Id,BalanceType=1时必填
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateDLPFileDetectTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDLPFileDetectTaskRequest(CreateDLPFileDetectTaskRequest source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.BalanceType != null) {
            this.BalanceType = new Long(source.BalanceType);
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.SelectNodeIds != null) {
            this.SelectNodeIds = new String[source.SelectNodeIds.length];
            for (int i = 0; i < source.SelectNodeIds.length; i++) {
                this.SelectNodeIds[i] = new String(source.SelectNodeIds[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "BalanceType", this.BalanceType);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamArraySimple(map, prefix + "SelectNodeIds.", this.SelectNodeIds);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

