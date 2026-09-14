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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchContext extends AbstractModel {

    /**
    * <p>请求来源<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CALL_SOURCE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>CALL_SOURCE_RAG</td><td>1</td><td>标准模式</td></tr><tr><td>CALL_SOURCE_WORKFLOW</td><td>2</td><td>工作流</td></tr><tr><td>CALL_SOURCE_PLUGIN</td><td>3</td><td>插件</td></tr><tr><td>CALL_SOURCE_OPENCLAW</td><td>4</td><td>openclaw</td></tr><tr><td>CALL_SOURCE_RECALL_TEST</td><td>5</td><td>召回测试</td></tr><tr><td>CALL_SOURCE_RECALL_TEST_DIFF</td><td>6</td><td>召回测试在对比的场景，同样需要触发检索接口。区别这种case前端不需要更新最新配置。因为对比1，2，3 可能最后保存的是2</td></tr></tbody></table></p>
    */
    @SerializedName("CallSource")
    @Expose
    private Long CallSource;

    /**
    * <p>adp域：1=开发域，2=生产域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ADP_DOMAIN_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>ADP_DOMAIN_DEV</td><td>1</td><td>开发域</td></tr><tr><td>ADP_DOMAIN_PROD</td><td>2</td><td>生产域</td></tr></tbody></table></p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>访客 ID</p>
    */
    @SerializedName("VisitorId")
    @Expose
    private String VisitorId;

    /**
     * Get <p>请求来源<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CALL_SOURCE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>CALL_SOURCE_RAG</td><td>1</td><td>标准模式</td></tr><tr><td>CALL_SOURCE_WORKFLOW</td><td>2</td><td>工作流</td></tr><tr><td>CALL_SOURCE_PLUGIN</td><td>3</td><td>插件</td></tr><tr><td>CALL_SOURCE_OPENCLAW</td><td>4</td><td>openclaw</td></tr><tr><td>CALL_SOURCE_RECALL_TEST</td><td>5</td><td>召回测试</td></tr><tr><td>CALL_SOURCE_RECALL_TEST_DIFF</td><td>6</td><td>召回测试在对比的场景，同样需要触发检索接口。区别这种case前端不需要更新最新配置。因为对比1，2，3 可能最后保存的是2</td></tr></tbody></table></p> 
     * @return CallSource <p>请求来源<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CALL_SOURCE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>CALL_SOURCE_RAG</td><td>1</td><td>标准模式</td></tr><tr><td>CALL_SOURCE_WORKFLOW</td><td>2</td><td>工作流</td></tr><tr><td>CALL_SOURCE_PLUGIN</td><td>3</td><td>插件</td></tr><tr><td>CALL_SOURCE_OPENCLAW</td><td>4</td><td>openclaw</td></tr><tr><td>CALL_SOURCE_RECALL_TEST</td><td>5</td><td>召回测试</td></tr><tr><td>CALL_SOURCE_RECALL_TEST_DIFF</td><td>6</td><td>召回测试在对比的场景，同样需要触发检索接口。区别这种case前端不需要更新最新配置。因为对比1，2，3 可能最后保存的是2</td></tr></tbody></table></p>
     */
    public Long getCallSource() {
        return this.CallSource;
    }

    /**
     * Set <p>请求来源<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CALL_SOURCE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>CALL_SOURCE_RAG</td><td>1</td><td>标准模式</td></tr><tr><td>CALL_SOURCE_WORKFLOW</td><td>2</td><td>工作流</td></tr><tr><td>CALL_SOURCE_PLUGIN</td><td>3</td><td>插件</td></tr><tr><td>CALL_SOURCE_OPENCLAW</td><td>4</td><td>openclaw</td></tr><tr><td>CALL_SOURCE_RECALL_TEST</td><td>5</td><td>召回测试</td></tr><tr><td>CALL_SOURCE_RECALL_TEST_DIFF</td><td>6</td><td>召回测试在对比的场景，同样需要触发检索接口。区别这种case前端不需要更新最新配置。因为对比1，2，3 可能最后保存的是2</td></tr></tbody></table></p>
     * @param CallSource <p>请求来源<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CALL_SOURCE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>CALL_SOURCE_RAG</td><td>1</td><td>标准模式</td></tr><tr><td>CALL_SOURCE_WORKFLOW</td><td>2</td><td>工作流</td></tr><tr><td>CALL_SOURCE_PLUGIN</td><td>3</td><td>插件</td></tr><tr><td>CALL_SOURCE_OPENCLAW</td><td>4</td><td>openclaw</td></tr><tr><td>CALL_SOURCE_RECALL_TEST</td><td>5</td><td>召回测试</td></tr><tr><td>CALL_SOURCE_RECALL_TEST_DIFF</td><td>6</td><td>召回测试在对比的场景，同样需要触发检索接口。区别这种case前端不需要更新最新配置。因为对比1，2，3 可能最后保存的是2</td></tr></tbody></table></p>
     */
    public void setCallSource(Long CallSource) {
        this.CallSource = CallSource;
    }

    /**
     * Get <p>adp域：1=开发域，2=生产域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ADP_DOMAIN_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>ADP_DOMAIN_DEV</td><td>1</td><td>开发域</td></tr><tr><td>ADP_DOMAIN_PROD</td><td>2</td><td>生产域</td></tr></tbody></table></p> 
     * @return Domain <p>adp域：1=开发域，2=生产域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ADP_DOMAIN_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>ADP_DOMAIN_DEV</td><td>1</td><td>开发域</td></tr><tr><td>ADP_DOMAIN_PROD</td><td>2</td><td>生产域</td></tr></tbody></table></p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>adp域：1=开发域，2=生产域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ADP_DOMAIN_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>ADP_DOMAIN_DEV</td><td>1</td><td>开发域</td></tr><tr><td>ADP_DOMAIN_PROD</td><td>2</td><td>生产域</td></tr></tbody></table></p>
     * @param Domain <p>adp域：1=开发域，2=生产域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ADP_DOMAIN_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>ADP_DOMAIN_DEV</td><td>1</td><td>开发域</td></tr><tr><td>ADP_DOMAIN_PROD</td><td>2</td><td>生产域</td></tr></tbody></table></p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>访客 ID</p> 
     * @return VisitorId <p>访客 ID</p>
     */
    public String getVisitorId() {
        return this.VisitorId;
    }

    /**
     * Set <p>访客 ID</p>
     * @param VisitorId <p>访客 ID</p>
     */
    public void setVisitorId(String VisitorId) {
        this.VisitorId = VisitorId;
    }

    public SearchContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchContext(SearchContext source) {
        if (source.CallSource != null) {
            this.CallSource = new Long(source.CallSource);
        }
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.VisitorId != null) {
            this.VisitorId = new String(source.VisitorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallSource", this.CallSource);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VisitorId", this.VisitorId);

    }
}

