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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDescribeNameListDetail extends AbstractModel {

    /**
    * 名单ID
    */
    @SerializedName("NameListId")
    @Expose
    private Long NameListId;

    /**
    * 名单名称
    */
    @SerializedName("ListName")
    @Expose
    private String ListName;

    /**
    * 名单类型 [1 黑名单 2 白名单]
    */
    @SerializedName("ListType")
    @Expose
    private Long ListType;

    /**
    * 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * 场景Code
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * 名单列表状态 [1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 加密类型 [0 无需加密，1 MD5加密，2 SHA256加密]
    */
    @SerializedName("EncryptionType")
    @Expose
    private Long EncryptionType;

    /**
     * Get 名单ID 
     * @return NameListId 名单ID
     */
    public Long getNameListId() {
        return this.NameListId;
    }

    /**
     * Set 名单ID
     * @param NameListId 名单ID
     */
    public void setNameListId(Long NameListId) {
        this.NameListId = NameListId;
    }

    /**
     * Get 名单名称 
     * @return ListName 名单名称
     */
    public String getListName() {
        return this.ListName;
    }

    /**
     * Set 名单名称
     * @param ListName 名单名称
     */
    public void setListName(String ListName) {
        this.ListName = ListName;
    }

    /**
     * Get 名单类型 [1 黑名单 2 白名单] 
     * @return ListType 名单类型 [1 黑名单 2 白名单]
     */
    public Long getListType() {
        return this.ListType;
    }

    /**
     * Set 名单类型 [1 黑名单 2 白名单]
     * @param ListType 名单类型 [1 黑名单 2 白名单]
     */
    public void setListType(Long ListType) {
        this.ListType = ListType;
    }

    /**
     * Get 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei] 
     * @return DataType 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     * @param DataType 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 场景Code 
     * @return SceneCode 场景Code
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景Code
     * @param SceneCode 场景Code
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 名单列表状态 [1 启用 2 停用] 
     * @return Status 名单列表状态 [1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 名单列表状态 [1 启用 2 停用]
     * @param Status 名单列表状态 [1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 加密类型 [0 无需加密，1 MD5加密，2 SHA256加密] 
     * @return EncryptionType 加密类型 [0 无需加密，1 MD5加密，2 SHA256加密]
     */
    public Long getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型 [0 无需加密，1 MD5加密，2 SHA256加密]
     * @param EncryptionType 加密类型 [0 无需加密，1 MD5加密，2 SHA256加密]
     */
    public void setEncryptionType(Long EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    public OutputDescribeNameListDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDescribeNameListDetail(OutputDescribeNameListDetail source) {
        if (source.NameListId != null) {
            this.NameListId = new Long(source.NameListId);
        }
        if (source.ListName != null) {
            this.ListName = new String(source.ListName);
        }
        if (source.ListType != null) {
            this.ListType = new Long(source.ListType);
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new Long(source.EncryptionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListId", this.NameListId);
        this.setParamSimple(map, prefix + "ListName", this.ListName);
        this.setParamSimple(map, prefix + "ListType", this.ListType);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);

    }
}

