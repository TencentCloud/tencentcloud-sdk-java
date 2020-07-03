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

public class CreateCfsPGroupResponse extends AbstractModel{

    /**
    * 权限组 ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 权限组名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权限组描述信息
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
    * 已经与该权限组绑定的文件系统个数
    */
    @SerializedName("BindCfsNum")
    @Expose
    private Long BindCfsNum;

    /**
    * 权限组创建时间
    */
    @SerializedName("CDate")
    @Expose
    private String CDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限组 ID 
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 权限组名字 
     * @return Name 权限组名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限组名字
     * @param Name 权限组名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权限组描述信息 
     * @return DescInfo 权限组描述信息
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set 权限组描述信息
     * @param DescInfo 权限组描述信息
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    /**
     * Get 已经与该权限组绑定的文件系统个数 
     * @return BindCfsNum 已经与该权限组绑定的文件系统个数
     */
    public Long getBindCfsNum() {
        return this.BindCfsNum;
    }

    /**
     * Set 已经与该权限组绑定的文件系统个数
     * @param BindCfsNum 已经与该权限组绑定的文件系统个数
     */
    public void setBindCfsNum(Long BindCfsNum) {
        this.BindCfsNum = BindCfsNum;
    }

    /**
     * Get 权限组创建时间 
     * @return CDate 权限组创建时间
     */
    public String getCDate() {
        return this.CDate;
    }

    /**
     * Set 权限组创建时间
     * @param CDate 权限组创建时间
     */
    public void setCDate(String CDate) {
        this.CDate = CDate;
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
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);
        this.setParamSimple(map, prefix + "BindCfsNum", this.BindCfsNum);
        this.setParamSimple(map, prefix + "CDate", this.CDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

