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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetHostTotalCountResponse extends AbstractModel{

    /**
    * 各项资源数量
system : 资源监控
account: 账号
port: 端口
process: 进程
app: 应用软件
database:数据库
webapp: Web应用
webframe: Web框架
webservice: Web服务
weblocation: Web站点
systempackage: 系统安装包
jar: jar包
initservice:启动服务
env: 环境变量
coremodule: 内核模块
    */
    @SerializedName("Types")
    @Expose
    private AssetKeyVal [] Types;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 各项资源数量
system : 资源监控
account: 账号
port: 端口
process: 进程
app: 应用软件
database:数据库
webapp: Web应用
webframe: Web框架
webservice: Web服务
weblocation: Web站点
systempackage: 系统安装包
jar: jar包
initservice:启动服务
env: 环境变量
coremodule: 内核模块 
     * @return Types 各项资源数量
system : 资源监控
account: 账号
port: 端口
process: 进程
app: 应用软件
database:数据库
webapp: Web应用
webframe: Web框架
webservice: Web服务
weblocation: Web站点
systempackage: 系统安装包
jar: jar包
initservice:启动服务
env: 环境变量
coremodule: 内核模块
     */
    public AssetKeyVal [] getTypes() {
        return this.Types;
    }

    /**
     * Set 各项资源数量
system : 资源监控
account: 账号
port: 端口
process: 进程
app: 应用软件
database:数据库
webapp: Web应用
webframe: Web框架
webservice: Web服务
weblocation: Web站点
systempackage: 系统安装包
jar: jar包
initservice:启动服务
env: 环境变量
coremodule: 内核模块
     * @param Types 各项资源数量
system : 资源监控
account: 账号
port: 端口
process: 进程
app: 应用软件
database:数据库
webapp: Web应用
webframe: Web框架
webservice: Web服务
weblocation: Web站点
systempackage: 系统安装包
jar: jar包
initservice:启动服务
env: 环境变量
coremodule: 内核模块
     */
    public void setTypes(AssetKeyVal [] Types) {
        this.Types = Types;
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

    public DescribeAssetHostTotalCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetHostTotalCountResponse(DescribeAssetHostTotalCountResponse source) {
        if (source.Types != null) {
            this.Types = new AssetKeyVal[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new AssetKeyVal(source.Types[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

