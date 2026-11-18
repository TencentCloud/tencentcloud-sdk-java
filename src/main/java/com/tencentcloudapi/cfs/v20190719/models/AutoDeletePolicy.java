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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoDeletePolicy extends AbstractModel {

    /**
    * <p>策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>文件系统Id</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>自动清理策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>待清理的路径</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * <p>自动清理策略状态</p><p>枚举值：</p><ul><li>enabling： 启用中</li><li>enabled： 已启用</li><li>disabling： 禁用中</li><li>disabed： 已禁用</li><li>deleting： 删除中</li><li>failed： 失败</li><li>creating： 创建中</li><li>updating： 修改中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>清理策略创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>策略更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>策略所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>策略 ID</p> 
     * @return PolicyId <p>策略 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略 ID</p>
     * @param PolicyId <p>策略 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>文件系统Id</p> 
     * @return FileSystemId <p>文件系统Id</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统Id</p>
     * @param FileSystemId <p>文件系统Id</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>自动清理策略名称</p> 
     * @return PolicyName <p>自动清理策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>自动清理策略名称</p>
     * @param PolicyName <p>自动清理策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>待清理的路径</p> 
     * @return Paths <p>待清理的路径</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>待清理的路径</p>
     * @param Paths <p>待清理的路径</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get <p>自动清理策略状态</p><p>枚举值：</p><ul><li>enabling： 启用中</li><li>enabled： 已启用</li><li>disabling： 禁用中</li><li>disabed： 已禁用</li><li>deleting： 删除中</li><li>failed： 失败</li><li>creating： 创建中</li><li>updating： 修改中</li></ul> 
     * @return Status <p>自动清理策略状态</p><p>枚举值：</p><ul><li>enabling： 启用中</li><li>enabled： 已启用</li><li>disabling： 禁用中</li><li>disabed： 已禁用</li><li>deleting： 删除中</li><li>failed： 失败</li><li>creating： 创建中</li><li>updating： 修改中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>自动清理策略状态</p><p>枚举值：</p><ul><li>enabling： 启用中</li><li>enabled： 已启用</li><li>disabling： 禁用中</li><li>disabed： 已禁用</li><li>deleting： 删除中</li><li>failed： 失败</li><li>creating： 创建中</li><li>updating： 修改中</li></ul>
     * @param Status <p>自动清理策略状态</p><p>枚举值：</p><ul><li>enabling： 启用中</li><li>enabled： 已启用</li><li>disabling： 禁用中</li><li>disabed： 已禁用</li><li>deleting： 删除中</li><li>failed： 失败</li><li>creating： 创建中</li><li>updating： 修改中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>清理策略创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>清理策略创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>清理策略创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>清理策略创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>策略更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>策略更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>策略更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>策略更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>策略所属地域</p> 
     * @return Region <p>策略所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>策略所属地域</p>
     * @param Region <p>策略所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrMsg <p>错误信息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrMsg <p>错误信息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public AutoDeletePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoDeletePolicy(AutoDeletePolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

