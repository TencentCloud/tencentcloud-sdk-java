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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeSpecRequest extends AbstractModel {

    /**
    * 可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息
    */
    @SerializedName("CvmPayMode")
    @Expose
    private Long CvmPayMode;

    /**
    * 节点类型,Master,Core,Task,Router,All
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 0:旧计费页面,1:新计费页面。 错填，默认为旧计费
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * 产品Id，不填为0，则表示所有productId，前台使用必填

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 场景名
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 类型为ComputeResource和EMR以及默认，默认为EMR
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * 计算资源id
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get 可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息 
     * @return ZoneId 可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息
     * @param ZoneId 可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息 
     * @return CvmPayMode 0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息
     */
    public Long getCvmPayMode() {
        return this.CvmPayMode;
    }

    /**
     * Set 0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息
     * @param CvmPayMode 0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息
     */
    public void setCvmPayMode(Long CvmPayMode) {
        this.CvmPayMode = CvmPayMode;
    }

    /**
     * Get 节点类型,Master,Core,Task,Router,All 
     * @return NodeType 节点类型,Master,Core,Task,Router,All
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型,Master,Core,Task,Router,All
     * @param NodeType 节点类型,Master,Core,Task,Router,All
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 0:旧计费页面,1:新计费页面。 错填，默认为旧计费 
     * @return TradeType 0:旧计费页面,1:新计费页面。 错填，默认为旧计费
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 0:旧计费页面,1:新计费页面。 错填，默认为旧计费
     * @param TradeType 0:旧计费页面,1:新计费页面。 错填，默认为旧计费
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 产品Id，不填为0，则表示所有productId，前台使用必填

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0 
     * @return ProductId 产品Id，不填为0，则表示所有productId，前台使用必填

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id，不填为0，则表示所有productId，前台使用必填

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     * @param ProductId 产品Id，不填为0，则表示所有productId，前台使用必填

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 场景名 
     * @return SceneName 场景名
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名
     * @param SceneName 场景名
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 类型为ComputeResource和EMR以及默认，默认为EMR 
     * @return ResourceBaseType 类型为ComputeResource和EMR以及默认，默认为EMR
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set 类型为ComputeResource和EMR以及默认，默认为EMR
     * @param ResourceBaseType 类型为ComputeResource和EMR以及默认，默认为EMR
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get 计算资源id 
     * @return ComputeResourceId 计算资源id
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set 计算资源id
     * @param ComputeResourceId 计算资源id
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    public DescribeNodeSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeSpecRequest(DescribeNodeSpecRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.CvmPayMode != null) {
            this.CvmPayMode = new Long(source.CvmPayMode);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CvmPayMode", this.CvmPayMode);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);

    }
}

