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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PGroupInfo  extends AbstractModel{

    /**
    * 权限组ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 权限组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
    * 创建时间
    */
    @SerializedName("CDate")
    @Expose
    private String CDate;

    /**
    * 关联文件系统个数
    */
    @SerializedName("BindCfsNum")
    @Expose
    private Long BindCfsNum;

    /**
     * 获取权限组ID
     * @return PGroupId 权限组ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * 设置权限组ID
     * @param PGroupId 权限组ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * 获取权限组名称
     * @return Name 权限组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置权限组名称
     * @param Name 权限组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取描述信息
     * @return DescInfo 描述信息
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * 设置描述信息
     * @param DescInfo 描述信息
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    /**
     * 获取创建时间
     * @return CDate 创建时间
     */
    public String getCDate() {
        return this.CDate;
    }

    /**
     * 设置创建时间
     * @param CDate 创建时间
     */
    public void setCDate(String CDate) {
        this.CDate = CDate;
    }

    /**
     * 获取关联文件系统个数
     * @return BindCfsNum 关联文件系统个数
     */
    public Long getBindCfsNum() {
        return this.BindCfsNum;
    }

    /**
     * 设置关联文件系统个数
     * @param BindCfsNum 关联文件系统个数
     */
    public void setBindCfsNum(Long BindCfsNum) {
        this.BindCfsNum = BindCfsNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);
        this.setParamSimple(map, prefix + "CDate", this.CDate);
        this.setParamSimple(map, prefix + "BindCfsNum", this.BindCfsNum);

    }
}

