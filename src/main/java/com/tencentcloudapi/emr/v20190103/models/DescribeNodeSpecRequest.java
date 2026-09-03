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
    * <p>可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息</p>
    */
    @SerializedName("CvmPayMode")
    @Expose
    private Long CvmPayMode;

    /**
    * <p>节点类型,Master,Core,Task,Router,All</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>0:旧计费页面,1:新计费页面。 错填，默认为旧计费</p>
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * <p>产品Id，不填为0，则表示所有productId，前台使用必填</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>场景名</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>计算资源id</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get <p>可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息</p> 
     * @return ZoneId <p>可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息</p>
     * @param ZoneId <p>可用区Id，可以通过https://document.capi.woa.com/document/api/1605/76892查询相关信息</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息</p> 
     * @return CvmPayMode <p>0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息</p>
     */
    public Long getCvmPayMode() {
        return this.CvmPayMode;
    }

    /**
     * Set <p>0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息</p>
     * @param CvmPayMode <p>0,按量，1包年包月，99按量+包年包月，错填将不会展示费用信息</p>
     */
    public void setCvmPayMode(Long CvmPayMode) {
        this.CvmPayMode = CvmPayMode;
    }

    /**
     * Get <p>节点类型,Master,Core,Task,Router,All</p> 
     * @return NodeType <p>节点类型,Master,Core,Task,Router,All</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型,Master,Core,Task,Router,All</p>
     * @param NodeType <p>节点类型,Master,Core,Task,Router,All</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>0:旧计费页面,1:新计费页面。 错填，默认为旧计费</p> 
     * @return TradeType <p>0:旧计费页面,1:新计费页面。 错填，默认为旧计费</p>
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set <p>0:旧计费页面,1:新计费页面。 错填，默认为旧计费</p>
     * @param TradeType <p>0:旧计费页面,1:新计费页面。 错填，默认为旧计费</p>
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get <p>产品Id，不填为0，则表示所有productId，前台使用必填</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p> 
     * @return ProductId <p>产品Id，不填为0，则表示所有productId，前台使用必填</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品Id，不填为0，则表示所有productId，前台使用必填</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     * @param ProductId <p>产品Id，不填为0，则表示所有productId，前台使用必填</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>场景名</p> 
     * @return SceneName <p>场景名</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>场景名</p>
     * @param SceneName <p>场景名</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>类型为ComputeResource和EMR以及默认，默认为EMR</p> 
     * @return ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     * @param ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>计算资源id</p> 
     * @return ComputeResourceId <p>计算资源id</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>计算资源id</p>
     * @param ComputeResourceId <p>计算资源id</p>
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

