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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfsInsInfo extends AbstractModel{

    /**
    * 用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户组id
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 文件系统实例id
    */
    @SerializedName("CfsId")
    @Expose
    private String CfsId;

    /**
    * 文件系统挂载点id
    */
    @SerializedName("MountInsId")
    @Expose
    private String MountInsId;

    /**
    * 本地挂载点
    */
    @SerializedName("LocalMountDir")
    @Expose
    private String LocalMountDir;

    /**
    * 远程挂载点
    */
    @SerializedName("RemoteMountDir")
    @Expose
    private String RemoteMountDir;

    /**
    * 文件系统ip，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 文件系统所在的私有网络id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountVpcId")
    @Expose
    private String MountVpcId;

    /**
    * 文件系统所在私有网络的子网id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountSubnetId")
    @Expose
    private String MountSubnetId;

    /**
     * Get 用户id 
     * @return UserId 用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
     * @param UserId 用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户组id 
     * @return UserGroupId 用户组id
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组id
     * @param UserGroupId 用户组id
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 文件系统实例id 
     * @return CfsId 文件系统实例id
     */
    public String getCfsId() {
        return this.CfsId;
    }

    /**
     * Set 文件系统实例id
     * @param CfsId 文件系统实例id
     */
    public void setCfsId(String CfsId) {
        this.CfsId = CfsId;
    }

    /**
     * Get 文件系统挂载点id 
     * @return MountInsId 文件系统挂载点id
     */
    public String getMountInsId() {
        return this.MountInsId;
    }

    /**
     * Set 文件系统挂载点id
     * @param MountInsId 文件系统挂载点id
     */
    public void setMountInsId(String MountInsId) {
        this.MountInsId = MountInsId;
    }

    /**
     * Get 本地挂载点 
     * @return LocalMountDir 本地挂载点
     */
    public String getLocalMountDir() {
        return this.LocalMountDir;
    }

    /**
     * Set 本地挂载点
     * @param LocalMountDir 本地挂载点
     */
    public void setLocalMountDir(String LocalMountDir) {
        this.LocalMountDir = LocalMountDir;
    }

    /**
     * Get 远程挂载点 
     * @return RemoteMountDir 远程挂载点
     */
    public String getRemoteMountDir() {
        return this.RemoteMountDir;
    }

    /**
     * Set 远程挂载点
     * @param RemoteMountDir 远程挂载点
     */
    public void setRemoteMountDir(String RemoteMountDir) {
        this.RemoteMountDir = RemoteMountDir;
    }

    /**
     * Get 文件系统ip，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddress 文件系统ip，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 文件系统ip，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddress 文件系统ip，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 文件系统所在的私有网络id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountVpcId 文件系统所在的私有网络id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountVpcId() {
        return this.MountVpcId;
    }

    /**
     * Set 文件系统所在的私有网络id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountVpcId 文件系统所在的私有网络id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountVpcId(String MountVpcId) {
        this.MountVpcId = MountVpcId;
    }

    /**
     * Get 文件系统所在私有网络的子网id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountSubnetId 文件系统所在私有网络的子网id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountSubnetId() {
        return this.MountSubnetId;
    }

    /**
     * Set 文件系统所在私有网络的子网id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountSubnetId 文件系统所在私有网络的子网id，配置 cfs 时无需填写。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountSubnetId(String MountSubnetId) {
        this.MountSubnetId = MountSubnetId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "CfsId", this.CfsId);
        this.setParamSimple(map, prefix + "MountInsId", this.MountInsId);
        this.setParamSimple(map, prefix + "LocalMountDir", this.LocalMountDir);
        this.setParamSimple(map, prefix + "RemoteMountDir", this.RemoteMountDir);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "MountVpcId", this.MountVpcId);
        this.setParamSimple(map, prefix + "MountSubnetId", this.MountSubnetId);

    }
}

