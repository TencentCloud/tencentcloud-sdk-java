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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreExecuteFileSettings  extends AbstractModel{

    /**
    * 脚本在COS上路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 执行脚本参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * COS的Bucket名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS的Region名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * COS的Domain数据
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * 获取脚本在COS上路径
     * @return Path 脚本在COS上路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置脚本在COS上路径
     * @param Path 脚本在COS上路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取执行脚本参数
     * @return Args 执行脚本参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * 设置执行脚本参数
     * @param Args 执行脚本参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * 获取COS的Bucket名称
     * @return Bucket COS的Bucket名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * 设置COS的Bucket名称
     * @param Bucket COS的Bucket名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * 获取COS的Region名称
     * @return Region COS的Region名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置COS的Region名称
     * @param Region COS的Region名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取COS的Domain数据
     * @return Domain COS的Domain数据
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置COS的Domain数据
     * @param Domain COS的Domain数据
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

