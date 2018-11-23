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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceRequest  extends AbstractModel{

    /**
    * 要操作的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改后的实例名称, 1-50 个英文、汉字、数字、连接线-或下划线_
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 横向扩缩容后的节点个数
    */
    @SerializedName("NodeNum")
    @Expose
    private Integer NodeNum;

    /**
    * 修改后的配置项, JSON格式字符串
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * 重置后的Kibana密码, 8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 修改后的访问控制列表
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * 磁盘大小,单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * 节点规格: 
ES.S1.SMALL2: 1 核 2G
ES.S1.MEDIUM4: 2 核 4G 
ES.S1.MEDIUM8: 2 核 8G 
ES.S1.LARGE16: 4 核 16G 
ES.S1.2XLARGE32: 8 核 32G 
ES.S1.4XLARGE64: 16 核 64G
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * 获取要操作的实例ID
     * @return InstanceId 要操作的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置要操作的实例ID
     * @param InstanceId 要操作的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取修改后的实例名称, 1-50 个英文、汉字、数字、连接线-或下划线_
     * @return InstanceName 修改后的实例名称, 1-50 个英文、汉字、数字、连接线-或下划线_
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置修改后的实例名称, 1-50 个英文、汉字、数字、连接线-或下划线_
     * @param InstanceName 修改后的实例名称, 1-50 个英文、汉字、数字、连接线-或下划线_
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取横向扩缩容后的节点个数
     * @return NodeNum 横向扩缩容后的节点个数
     */
    public Integer getNodeNum() {
        return this.NodeNum;
    }

    /**
     * 设置横向扩缩容后的节点个数
     * @param NodeNum 横向扩缩容后的节点个数
     */
    public void setNodeNum(Integer NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * 获取修改后的配置项, JSON格式字符串
     * @return EsConfig 修改后的配置项, JSON格式字符串
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * 设置修改后的配置项, JSON格式字符串
     * @param EsConfig 修改后的配置项, JSON格式字符串
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * 获取重置后的Kibana密码, 8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号
     * @return Password 重置后的Kibana密码, 8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置重置后的Kibana密码, 8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号
     * @param Password 重置后的Kibana密码, 8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取修改后的访问控制列表
     * @return EsAcl 修改后的访问控制列表
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * 设置修改后的访问控制列表
     * @param EsAcl 修改后的访问控制列表
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * 获取磁盘大小,单位GB
     * @return DiskSize 磁盘大小,单位GB
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置磁盘大小,单位GB
     * @param DiskSize 磁盘大小,单位GB
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取节点规格: 
ES.S1.SMALL2: 1 核 2G
ES.S1.MEDIUM4: 2 核 4G 
ES.S1.MEDIUM8: 2 核 8G 
ES.S1.LARGE16: 4 核 16G 
ES.S1.2XLARGE32: 8 核 32G 
ES.S1.4XLARGE64: 16 核 64G
     * @return NodeType 节点规格: 
ES.S1.SMALL2: 1 核 2G
ES.S1.MEDIUM4: 2 核 4G 
ES.S1.MEDIUM8: 2 核 8G 
ES.S1.LARGE16: 4 核 16G 
ES.S1.2XLARGE32: 8 核 32G 
ES.S1.4XLARGE64: 16 核 64G
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * 设置节点规格: 
ES.S1.SMALL2: 1 核 2G
ES.S1.MEDIUM4: 2 核 4G 
ES.S1.MEDIUM8: 2 核 8G 
ES.S1.LARGE16: 4 核 16G 
ES.S1.2XLARGE32: 8 核 32G 
ES.S1.4XLARGE64: 16 核 64G
     * @param NodeType 节点规格: 
ES.S1.SMALL2: 1 核 2G
ES.S1.MEDIUM4: 2 核 4G 
ES.S1.MEDIUM8: 2 核 8G 
ES.S1.LARGE16: 4 核 16G 
ES.S1.2XLARGE32: 8 核 32G 
ES.S1.4XLARGE64: 16 核 64G
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

