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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBLogFilesResponse  extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 请求日志总数
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;

    /**
    * 包含uri、length、mtime（修改时间）等信息
    */
    @SerializedName("Files")
    @Expose
    private LogFileInfo [] Files;

    /**
    * 如果是VPC网络的实例，做用本前缀加上URI为下载地址
    */
    @SerializedName("Vpcprefix")
    @Expose
    private String Vpcprefix;

    /**
    * 如果是普通网络的实例，做用本前缀加上URI为下载地址
    */
    @SerializedName("Normalprefix")
    @Expose
    private String Normalprefix;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     * @return Type 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     * @param Type 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取请求日志总数
     * @return Total 请求日志总数
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置请求日志总数
     * @param Total 请求日志总数
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * 获取包含uri、length、mtime（修改时间）等信息
     * @return Files 包含uri、length、mtime（修改时间）等信息
     */
    public LogFileInfo [] getFiles() {
        return this.Files;
    }

    /**
     * 设置包含uri、length、mtime（修改时间）等信息
     * @param Files 包含uri、length、mtime（修改时间）等信息
     */
    public void setFiles(LogFileInfo [] Files) {
        this.Files = Files;
    }

    /**
     * 获取如果是VPC网络的实例，做用本前缀加上URI为下载地址
     * @return Vpcprefix 如果是VPC网络的实例，做用本前缀加上URI为下载地址
     */
    public String getVpcprefix() {
        return this.Vpcprefix;
    }

    /**
     * 设置如果是VPC网络的实例，做用本前缀加上URI为下载地址
     * @param Vpcprefix 如果是VPC网络的实例，做用本前缀加上URI为下载地址
     */
    public void setVpcprefix(String Vpcprefix) {
        this.Vpcprefix = Vpcprefix;
    }

    /**
     * 获取如果是普通网络的实例，做用本前缀加上URI为下载地址
     * @return Normalprefix 如果是普通网络的实例，做用本前缀加上URI为下载地址
     */
    public String getNormalprefix() {
        return this.Normalprefix;
    }

    /**
     * 设置如果是普通网络的实例，做用本前缀加上URI为下载地址
     * @param Normalprefix 如果是普通网络的实例，做用本前缀加上URI为下载地址
     */
    public void setNormalprefix(String Normalprefix) {
        this.Normalprefix = Normalprefix;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "Vpcprefix", this.Vpcprefix);
        this.setParamSimple(map, prefix + "Normalprefix", this.Normalprefix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

