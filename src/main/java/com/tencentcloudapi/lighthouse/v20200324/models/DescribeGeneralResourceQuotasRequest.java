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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralResourceQuotasRequest extends AbstractModel{

    /**
    * 资源名列表，可取值:
- GENERAL_BUNDLE_INSTANCE 通用型套餐实例
- STORAGE_BUNDLE_INSTANCE 存储型套餐实例 
- ENTERPRISE_BUNDLE_INSTANCE 企业型套餐实例 
- EXCLUSIVE_BUNDLE_INSTANCE 专属型套餐实例
- BEFAST_BUNDLE_INSTANCE 蜂驰型套餐实例
- USER_KEY_PAIR 密钥对
- SNAPSHOT 快照
- BLUEPRINT 自定义镜像
- FREE_BLUEPRINT 免费自定义镜像
- DATA_DISK 数据盘
- FIREWALL_RULE 防火墙规则
    */
    @SerializedName("ResourceNames")
    @Expose
    private String [] ResourceNames;

    /**
     * Get 资源名列表，可取值:
- GENERAL_BUNDLE_INSTANCE 通用型套餐实例
- STORAGE_BUNDLE_INSTANCE 存储型套餐实例 
- ENTERPRISE_BUNDLE_INSTANCE 企业型套餐实例 
- EXCLUSIVE_BUNDLE_INSTANCE 专属型套餐实例
- BEFAST_BUNDLE_INSTANCE 蜂驰型套餐实例
- USER_KEY_PAIR 密钥对
- SNAPSHOT 快照
- BLUEPRINT 自定义镜像
- FREE_BLUEPRINT 免费自定义镜像
- DATA_DISK 数据盘
- FIREWALL_RULE 防火墙规则 
     * @return ResourceNames 资源名列表，可取值:
- GENERAL_BUNDLE_INSTANCE 通用型套餐实例
- STORAGE_BUNDLE_INSTANCE 存储型套餐实例 
- ENTERPRISE_BUNDLE_INSTANCE 企业型套餐实例 
- EXCLUSIVE_BUNDLE_INSTANCE 专属型套餐实例
- BEFAST_BUNDLE_INSTANCE 蜂驰型套餐实例
- USER_KEY_PAIR 密钥对
- SNAPSHOT 快照
- BLUEPRINT 自定义镜像
- FREE_BLUEPRINT 免费自定义镜像
- DATA_DISK 数据盘
- FIREWALL_RULE 防火墙规则
     */
    public String [] getResourceNames() {
        return this.ResourceNames;
    }

    /**
     * Set 资源名列表，可取值:
- GENERAL_BUNDLE_INSTANCE 通用型套餐实例
- STORAGE_BUNDLE_INSTANCE 存储型套餐实例 
- ENTERPRISE_BUNDLE_INSTANCE 企业型套餐实例 
- EXCLUSIVE_BUNDLE_INSTANCE 专属型套餐实例
- BEFAST_BUNDLE_INSTANCE 蜂驰型套餐实例
- USER_KEY_PAIR 密钥对
- SNAPSHOT 快照
- BLUEPRINT 自定义镜像
- FREE_BLUEPRINT 免费自定义镜像
- DATA_DISK 数据盘
- FIREWALL_RULE 防火墙规则
     * @param ResourceNames 资源名列表，可取值:
- GENERAL_BUNDLE_INSTANCE 通用型套餐实例
- STORAGE_BUNDLE_INSTANCE 存储型套餐实例 
- ENTERPRISE_BUNDLE_INSTANCE 企业型套餐实例 
- EXCLUSIVE_BUNDLE_INSTANCE 专属型套餐实例
- BEFAST_BUNDLE_INSTANCE 蜂驰型套餐实例
- USER_KEY_PAIR 密钥对
- SNAPSHOT 快照
- BLUEPRINT 自定义镜像
- FREE_BLUEPRINT 免费自定义镜像
- DATA_DISK 数据盘
- FIREWALL_RULE 防火墙规则
     */
    public void setResourceNames(String [] ResourceNames) {
        this.ResourceNames = ResourceNames;
    }

    public DescribeGeneralResourceQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralResourceQuotasRequest(DescribeGeneralResourceQuotasRequest source) {
        if (source.ResourceNames != null) {
            this.ResourceNames = new String[source.ResourceNames.length];
            for (int i = 0; i < source.ResourceNames.length; i++) {
                this.ResourceNames[i] = new String(source.ResourceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceNames.", this.ResourceNames);

    }
}

